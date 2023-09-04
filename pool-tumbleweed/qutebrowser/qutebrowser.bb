SUMMARY = "Keyboard-driven vim-like browser based on Qt6"
DESCRIPTION = "qutebrowser is a keyboard-focused browser with a minimal GUI. \
It's based on PyQt6 and QtWebEngine."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "qutebrowser-3.0.0-1.1.noarch.rpm"
RPM_HASH = "b45e563addb2d55edd7d981bf58285128820bc2b6f45060ee59722408239ade9898028a5b6d04d96ccbc25b9fc3615fd8cfcfbf2cbb8e15f24de3d7e6e1408b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-qutebrowser \
python3dist-qutebrowser \
qutebrowser \
qutebrowser-git-qt6"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/node \
/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-Jinja2 \
python3-MarkupSafe \
python3-PyQt6-WebEngine \
python3-PyYAML \
python3-opengl \
qt6-sql-sqlite"

inherit rpm
