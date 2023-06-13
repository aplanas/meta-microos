SUMMARY = "Backend poppler for pqiv"
DESCRIPTION = "Backend poppler for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-poppler-2.12-1.4.aarch64.rpm"
RPM_HASH = "cd5561fd9a73f72795468550e94ac5f794eae22f943686636e18591a12d25ffc11cc10ccdd446544c8e3be10412051ba19cc41d46d2b5d0b58733850c4f67b50"

RPROVIDES:${PN} += "pqiv-poppler \
pqiv-poppler(aarch-64)"

RDEPENDS:${PN} += "libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpoppler-glib.so.8()(64bit) \
pqiv"

inherit rpm
