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

RPM_NAME = "python311-wcwidth-0.2.6-3.1.noarch.rpm"
RPM_HASH = "92644b9f681be94beed3b81ebac273fe05590c50395936498df060e554ff63ff1050e7d00aa8ad43b13d185bfbd7ab3feb70efd8b327fe870a144bf2fc283bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wcwidth \
python3.11dist-wcwidth \
python311-wcwidth \
python3dist-wcwidth"

RDEPENDS:${PN} += "python-abi"

inherit rpm
