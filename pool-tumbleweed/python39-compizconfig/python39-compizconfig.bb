SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python39-compizconfig-0.8.18-2.21.aarch64.rpm"
RPM_HASH = "91eaea6a0d92a60a4987fda63bc6689e0ea73adc3c2286673df6823df15823de2300db7d54a4a86ca94a71154ead35cf524b1ef2d1cdda4d08ac3f499e1e8004"

RPROVIDES:${PN} += "python39-compizconfig \
python39-compizconfig(aarch-64)"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcompizconfig.so.0()(64bit) \
python(abi)"

inherit rpm
