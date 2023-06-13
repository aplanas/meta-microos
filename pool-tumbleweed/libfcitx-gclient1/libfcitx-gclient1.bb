SUMMARY = "GClient library of fcitx"
DESCRIPTION = "GClient library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-gclient1-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "77093bcb7820196bcca12a0913baaac8c433a911734b358c0c3683272c9ad143253139a75babb576e0689e8a788858be213930f7b4ec10a99021675c9bff8694"

RPROVIDES:${PN} += "libfcitx-gclient.so.1()(64bit) \
libfcitx-gclient1 \
libfcitx-gclient1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfcitx-utils.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
