SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python39-pudb-2022.1.3-1.6.noarch.rpm"
RPM_HASH = "28f19f22df594d46c06aa19b3694db3d2ae4a07f3c89e620ed806222c34854dee5881e02c87b988f77f24c5c96dab181d209b70be87a95b78aa11bfd1a82ff7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pudb \
python39-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pygments \
python39-urwid \
update-alternatives"

inherit rpm
