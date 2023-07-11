SUMMARY = "HTML5 client for Xpra"
DESCRIPTION = "This is the HTML5 client for Xpra, \
which can be made available for browsers by the xpra server \
or by any other web server."
LICENSE = "GPL-2.0+ & BSD-3-Clause & LGPL-3.0+ & MIT"

PV = "9.0+git20230615.cdd9ea7"

RPM_NAME = "xpra-html5-9.0+git20230615.cdd9ea7-1.1.noarch.rpm"
RPM_HASH = "58f35648ffd8879a530b05cb6cc48592a21dd9b1d33b790e4cf358c6e401327e6d35ed60134871ac96179ab3e72a447b198090abe6ab98cabde4eb67e7ded15e"
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
