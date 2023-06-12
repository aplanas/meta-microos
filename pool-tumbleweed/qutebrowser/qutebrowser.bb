SUMMARY = "Keyboard-driven vim-like browser based on Qt5"
DESCRIPTION = "qutebrowser is a keyboard-focused browser with a minimal GUI. \
It's based on PyQt5 and can use either QtWebEngine or QtWebKit."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.4"

RPM_NAME = "qutebrowser-2.5.4-1.1.noarch.rpm"
RPM_HASH = "cb845449d3076c789e5a8fbee02443d55c9c8e66d5c7ad9c4900b1ff9ee12a12ff1956ccf667afec0c9b9e8c7092c85032abfbee2a6831a3e50a3815ed70c464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.qutebrowser.qutebrowser.desktop) \
metainfo() \
metainfo(org.qutebrowser.qutebrowser.appdata.xml) \
mimehandler(application/rdf+xml) \
mimehandler(application/xhtml+xml) \
mimehandler(application/xml) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(text/html) \
mimehandler(text/xml) \
mimehandler(x-scheme-handler/http) \
mimehandler(x-scheme-handler/https) \
mimehandler(x-scheme-handler/qute) \
python3.10dist(qutebrowser) \
python3dist(qutebrowser) \
qutebrowser"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/node \
/usr/bin/python3 \
libqt5-sql-sqlite \
python(abi) \
python3-Jinja2 \
python3-MarkupSafe \
python3-PyYAML \
python3-opengl \
python3-qt5 \
python3-qtwebengine-qt5"

inherit rpm
