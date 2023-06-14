SUMMARY = "A guile Library for Scientific Simulations"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl7-4.5.1-1.7.aarch64.rpm"
RPM_HASH = "e3da52cd7f8e436621a3a1c145db9850d75a8b20d2d487573fcd8e2145f116a2f1b746c2a1da4c4c79a0685c3a1664503a7446625e57285ebb80af5e00069f1b"

RPROVIDES:${PN} += "libctl.so.7 \
libctl7 \
libctlgeom.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libm.so.6"

inherit rpm
