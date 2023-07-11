SUMMARY = "GClient library of fcitx"
DESCRIPTION = "GClient library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-gclient1-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "9c19d69db153594560403de9bb5d846c105d5f8970ec9a91378a054eb37e90276db6613bd71e8fc08f76c2f3e8f1a3c13ecab0073d237e0ba6ab7cd5cb1e9e78"

RPROVIDES:${PN} += "libfcitx-gclient.so.1 \
libfcitx-gclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfcitx-utils.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
