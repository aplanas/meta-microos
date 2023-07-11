SUMMARY = "Development files for qhexedit2"
DESCRIPTION = "The qhexedit2-devel package contains libraries and header files for \
developing applications that use qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "qhexedit2-devel-0.8.9-1.16.aarch64.rpm"
RPM_HASH = "9e0e2415c1e2f79fdd577bdd730f89de6940ded1d02dcb798428329649f8ce1934c52cd85c432cce9362f1b82882b77d18ab2994c4b94a2a61e4603d5decfecc"

RPROVIDES:${PN} += "pkgconfig-qhexedit2 \
qhexedit2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhexedit4"

inherit rpm
