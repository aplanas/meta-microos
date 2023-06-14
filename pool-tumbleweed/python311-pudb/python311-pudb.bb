SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python311-pudb-2022.1.3-1.4.noarch.rpm"
RPM_HASH = "37241d3734ebde0849a36c15e26364f880e230f5271579d1c3bd1746ecc43766fb5069e294cda791b8138c2f5e45f2c28d7a9089991d1e468ee6bd576ef70e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pudb \
python311-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Pygments \
python311-urwid \
update-alternatives"

inherit rpm
