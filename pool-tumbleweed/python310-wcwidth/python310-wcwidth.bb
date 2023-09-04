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

RPM_NAME = "python310-wcwidth-0.2.6-3.1.noarch.rpm"
RPM_HASH = "1e200774862744957fe7de55727c2b2f7b2fe61c59cdfe5229ca9ada876a270b3febebbc33f006412da3698a70928b2e5fc959750822c9cd027923c1340d4772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wcwidth \
python310-wcwidth \
python3dist-wcwidth"

RDEPENDS:${PN} += "python-abi"

inherit rpm
