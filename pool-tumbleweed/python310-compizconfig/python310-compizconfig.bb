SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python310-compizconfig-0.8.18-2.21.aarch64.rpm"
RPM_HASH = "4c4e710a3b682e9a45b9715638296b657b7222f11ed77776486bf7ce2101a2d58dbd7aac5ca6ca0fa86adf118910ee8281fe28930d58dcb506888c6e07a84c3f"

RPROVIDES:${PN} += "python3-compizconfig \
python310-compizconfig \
python310-compizconfig(aarch-64)"
RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcompizconfig.so.0()(64bit) \
python(abi)"

inherit rpm
