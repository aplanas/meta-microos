SUMMARY = "Gcin anthy module"
DESCRIPTION = "gcin anthy module, try this to input Japanese with libanthy"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-anthy-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "64791855dc884356a5e6255d063231e7a316ad83ba3962a849e4fa945e410ee80a9637b7a1ad5cb32628e90924953f59712c68a28b95d6abae1d4459ac0df4c7"

RPROVIDES:${PN} += "gcin-anthy \
gcin-anthy(aarch-64) \
gcin-anthy-module"
RDEPENDS:${PN} += "/sbin/ldconfig \
gcin \
libanthy.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
