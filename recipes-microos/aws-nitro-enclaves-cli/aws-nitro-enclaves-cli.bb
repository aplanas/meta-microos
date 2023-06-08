SUMMARY = "Tools for managing enclaves"
DESCRIPTION = "A collection of tools and commands used for managing the lifecycle of \
enclaves. The Nitro CLI needs to be installed on the parent instance, \
and it can be used to start, manage, and terminate enclaves."
LICENSE = "Apache-2.0"

PV = "1.2.2~git0.4ccc639"

RPM_NAME = "aws-nitro-enclaves-cli-1.2.2~git0.4ccc639-1.3.aarch64.rpm"
RPM_HASH = "24e8f29c5881fafdeb72812898c67d5661dfa0030803706cd452bce8e499b7578f72a5e9943fd583025df2529027727d2d90225e4e8069cfc2d03858eff8f922"

RPROVIDES:${PN} += "aws-nitro-enclaves-cli aws-nitro-enclaves-cli(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh aws-nitro-enclaves-binaryblobs coreutils jq libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) system-group-ne"

inherit rpm
