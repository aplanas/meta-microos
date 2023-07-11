SUMMARY = "Development files for the CM computation software"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "cm-devel-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "4cb8cd68b9108be548e1a524fe9d7d13c92df1f1847afaad8adfb592d3c3d66328381b91b987b42f370f6a8862cadf10ebd16623bde99107862b9413072b8304"

RPROVIDES:${PN} += "cm-devel"

RDEPENDS:${PN} += "libcm1 \
mpc-devel \
mpfrcx-devel \
zlib-devel"

inherit rpm
