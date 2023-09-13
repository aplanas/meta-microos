SUMMARY = "HTML5 client for Xpra"
DESCRIPTION = "This is the HTML5 client for Xpra, \
which can be made available for browsers by the xpra server \
or by any other web server."
LICENSE = "GPL-2.0+ & BSD-3-Clause & LGPL-3.0+ & MIT"

PV = "9.0+git20230830.e5fb000"

RPM_NAME = "xpra-html5-9.0+git20230830.e5fb000-1.1.noarch.rpm"
RPM_HASH = "4f3b39b2318b490871e73e82c444661b6beaca679fe1b0340356384c378426ed5070183f643d8c2354ea136cede31a7a61ae205651b7eca72e66917ee7531140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-js-aurora \
bundled-js-bencode \
bundled-js-broadway \
bundled-js-forge \
bundled-js-jquery \
bundled-js-jquery-ui \
bundled-js-lz4 \
bundled-js-zlib \
config-xpra-html5 \
xpra-html5"

RDEPENDS:${PN} += "cups-client \
dejavu-fonts \
python3-avahi \
python3-netifaces \
python3-paramiko \
python3-pyinotify \
python3-pyxdg \
python3-websockify \
python3-zeroconf \
qrencode \
xpra"

inherit rpm
