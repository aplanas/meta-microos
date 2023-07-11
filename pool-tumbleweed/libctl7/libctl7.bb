SUMMARY = "A guile Library for Scientific Simulations"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl7-4.5.1-1.8.aarch64.rpm"
RPM_HASH = "d15fe8075b9f6421120772b25b3ead2ae8ebf575c562090e9393b68c609619ebb6b9dfd8aedc2bc343f53b20d766ec5911f24ef30140e216773cd080d20aea34"

RPROVIDES:${PN} += "libctl.so.7 \
libctl7 \
libctlgeom.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libm.so.6"

inherit rpm
