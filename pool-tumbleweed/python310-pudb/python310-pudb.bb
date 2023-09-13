SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2022.1.3"

RPM_NAME = "python310-pudb-2022.1.3-2.1.noarch.rpm"
RPM_HASH = "305e5fee456af83cd0bb1fda62baf3551905bdaa35af984b9e026bfb86485747d28d1b608aee7860775aef58947d49ac5066eebeda82b2a979fdc49a14b30cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pudb \
python310-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pygments \
python310-jedi \
python310-packaging \
python310-urwid \
python310-urwid-readline \
update-alternatives"

inherit rpm
