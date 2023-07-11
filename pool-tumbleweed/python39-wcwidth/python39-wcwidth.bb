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

RPM_NAME = "python39-wcwidth-0.2.6-2.3.noarch.rpm"
RPM_HASH = "f1a0a6b08c0235ed13186fb710980c9b57165d934c6cad5cfda6a5f961f209d64dc69da554c64f30e58679ac159e005e23f7f62a91f992c87c5f04b3da2ea613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wcwidth \
python39-wcwidth \
python3dist-wcwidth"

RDEPENDS:${PN} += "python-abi"

inherit rpm
