SUMMARY = "Keyboard-driven vim-like browser based on Qt5"
DESCRIPTION = "qutebrowser is a keyboard-focused browser with a minimal GUI. \
It's based on PyQt5 and can use either QtWebEngine or QtWebKit."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.4"

RPM_NAME = "qutebrowser-2.5.4-1.2.noarch.rpm"
RPM_HASH = "127dcb59469d87e9557e9932eded01025df66e2a206b1bfaf4700a48c40ac39d229b6d794d8547bdd1dd958f2746c9964120fe1ac13c96e8f84301bbc2d1d291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-qutebrowser \
python3dist-qutebrowser \
qutebrowser"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/node \
/usr/bin/python3 \
/usr/bin/sh \
libqt5-sql-sqlite \
python-abi \
python3-Jinja2 \
python3-MarkupSafe \
python3-PyYAML \
python3-opengl \
python3-qt5 \
python3-qtwebengine-qt5"

inherit rpm
