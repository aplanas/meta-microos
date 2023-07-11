SUMMARY = "Number of Terminal column cells of wide-character codes"
DESCRIPTION = "This API is mainly for Terminal Emulator implementors -- any python \
program that attempts to determine the printable width of a string on \
a Terminal. It is implemented in python (no C library calls) and has \
no 3rd-party dependencies. \
 \
It is certainly possible to use your Operating System's wcwidth(3) \
and wcswidth(3) calls if it is POSIX-conforming, but this would not \
be possible on non-POSIX platforms, such as Windows, or for \
alternative Python implementations, such as jython.  It is also \
commonly many releases older than the most current Unicode Standard \
release files, which this project aims to track."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python310-wcwidth-0.2.6-2.3.noarch.rpm"
RPM_HASH = "fc587381ed47bf046731c2670bc6721d4f8c48dd4a8463ac8bc6731ec2f314134d48f33b58e7f1e807d64763189d9f7d9f5e06c94893a45b86ce3e67f4012c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wcwidth \
python310-wcwidth \
python3dist-wcwidth"

RDEPENDS:${PN} += "python-abi"

inherit rpm
