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

RPM_NAME = "python39-wcwidth-0.2.6-3.1.noarch.rpm"
RPM_HASH = "50e9d572811528110965375f825f8d9c97c58e5ceeb616a60b060e53c6d5455b337566297186f4c23d3d4612f80b2f207c773490c9ac9e86c34f53fb8ce11154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wcwidth \
python39-wcwidth \
python3dist-wcwidth"

RDEPENDS:${PN} += "python-abi"

inherit rpm
