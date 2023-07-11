SUMMARY = "Tools for managing enclaves"
DESCRIPTION = "A collection of tools and commands used for managing the lifecycle of \
enclaves. The Nitro CLI needs to be installed on the parent instance, \
and it can be used to start, manage, and terminate enclaves."
LICENSE = "Apache-2.0"

PV = "1.2.2~git0.4ccc639"

RPM_NAME = "aws-nitro-enclaves-cli-1.2.2~git0.4ccc639-1.5.aarch64.rpm"
RPM_HASH = "6c7253569d05deb7987d07274f4d44a398afc549c2b1b0a416b9cea7d8a69c73c26b2a112c7140d0ffb5831f41851283729a686cba045537273b0060f76da62d"

RPROVIDES:${PN} += "aws-nitro-enclaves-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
aws-nitro-enclaves-binaryblobs \
coreutils \
jq \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
system-group-ne"

inherit rpm
