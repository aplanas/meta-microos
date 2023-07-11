SUMMARY = "Build environment for libkexiv2, a library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkexiv2-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f2a46b03fc381b808b92b2346da8f7168fcdcd9a52ce5f949b2a3823ea881b93743f6ddec69cdcc6ebc11da8ecc97b39cbae0785b9dde43d37bb879709a49a9a"

RPROVIDES:${PN} += "cmake-KF5KExiv2 \
libkexiv2-devel \
libkexiv2-kf5-devel"

RDEPENDS:${PN} += "libKF5KExiv2-15-0-0"

inherit rpm
