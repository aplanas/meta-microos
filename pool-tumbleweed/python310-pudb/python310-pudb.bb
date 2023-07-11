SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python310-pudb-2022.1.3-1.6.noarch.rpm"
RPM_HASH = "26d6062396e91cc1232d4090189c0190d3490dbce244963a1d6bef44748f3f58c6dde6029e49e44426cc263b89309a0aad5252395a77ee0b5d587f49273825d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pudb \
python310-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pygments \
python310-urwid \
update-alternatives"

inherit rpm
