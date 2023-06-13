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

RPM_NAME = "python39-wcwidth-0.2.6-2.1.noarch.rpm"
RPM_HASH = "a9d8253f5fdec98e3e61a5460630cc677be7ea90b78d047ccc5d56f1a1ed646759eef72886bdc8a49226c05e7870eaab499d47ddc946d78e79a592c616ffd4f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wcwidth) \
python39-wcwidth \
python3dist(wcwidth)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
