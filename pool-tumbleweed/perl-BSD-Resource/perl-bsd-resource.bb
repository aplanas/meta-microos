SUMMARY = "BSD process resource limit and priority functions"
DESCRIPTION = "BSD process resource limit and priority functions"
LICENSE = "Artistic-2.0 | LGPL-2.0"

PV = "1.2911"

RPM_NAME = "perl-BSD-Resource-1.2911-1.31.aarch64.rpm"
RPM_HASH = "766eb674391d949749e7bd46606d620d8824342a0bfc594aef549f027531442a63ebc33711c2ef9c0a2e784e32e1853394f33032b1f6d86fa6ac412d4e5361c4"

RPROVIDES:${PN} += "perl(BSD::Resource) \
perl-BSD-Resource \
perl-BSD-Resource(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
