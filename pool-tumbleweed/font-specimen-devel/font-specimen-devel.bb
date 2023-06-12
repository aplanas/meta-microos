SUMMARY = "Development Files for libspecimen0"
DESCRIPTION = "Header and development files for font-specimen library."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "font-specimen-devel-20150202-3.17.aarch64.rpm"
RPM_HASH = "53c1be15482e5f61226a0209404cfaf485a1050e996fe84c4dbbc69cfa2c42fd9bf0fdb6defcf7affdc94872423d51ae5e1e6e895f412db3fe0caa61ee572a31"

RPROVIDES:${PN} += "font-specimen-devel \
font-specimen-devel(aarch-64) \
pkgconfig(font-specimen)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfont-specimen0"

inherit rpm
