SUMMARY = "Qt Library that wraps the gpodder.net Web API"
DESCRIPTION = "libmygpo-qt5 is a Qt Library that wraps the gpodder.net Web API (http://wiki.gpodder.org/wiki/Web_Services/API_2) \
 \
v1.0 wraps nearly every Request from the gpodder.net API except: \
- Simple API Calls Downloading subscription Lists & Uploading subscription Lists \
- Retrieving Subscription Changes (you should use 'Retrieving Updates for a given Device' instead)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libmygpo-qt5-1-1.1.0-2.24.aarch64.rpm"
RPM_HASH = "8b614eddf30fe034249082269a240990a825c8ea15bf046bb67ff7f4d77de668965944ca3ac0818f1d49a6060cd99fccf6b0e5eb63a098d3c6db6f79e1bead02"

RPROVIDES:${PN} += "libmygpo-qt5-1 \
libmygpo-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
