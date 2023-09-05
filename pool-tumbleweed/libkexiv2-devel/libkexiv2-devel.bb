SUMMARY = "Build environment for libkexiv2, a library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkexiv2-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "51f24beaf0b873e0699fc8f22c2ec10faa2f658c61a4881c7ec81ddeee149d547b0e408ca63bfc368c7621d400d3f84115aac45467189118f8e395886df0536d"

RPROVIDES:${PN} += "cmake-KF5KExiv2 \
libkexiv2-devel \
libkexiv2-kf5-devel"

RDEPENDS:${PN} += "libKF5KExiv2-15-0-0"

inherit rpm
