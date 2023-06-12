SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python311-zope.i18nmessageid-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "7289b4c6ce4ad122b35ee913054d7f9b2ecc33a4a99e2a549eb4a3c01dcb1f1826d879f6d5820b7220c837d1bdd177be2d9eaca000b913504435f822cb465ade"

RPROVIDES:${PN} += "python3.11dist(zope.i18nmessageid) \
python311-zope.i18nmessageid \
python311-zope.i18nmessageid(aarch-64) \
python3dist(zope.i18nmessageid)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
