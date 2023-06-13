SUMMARY = "Package provides recommended R-class"
DESCRIPTION = "This packages provides R-class, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.21"

RPM_NAME = "R-class-7.3.21-45.2.aarch64.rpm"
RPM_HASH = "52b12c2e482b7f3689d41a65fa84ee9830cdd76f09c612c0216c0e164a67c9feffe3d91e27a2eabe896cedf01ad7054fb28111a7d6a7610f0eb6053e16c0680f"

RPROVIDES:${PN} += "R-class \
R-class(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
