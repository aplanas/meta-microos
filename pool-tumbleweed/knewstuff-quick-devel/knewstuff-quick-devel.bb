SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knewstuff-quick-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "80138d03ac3c17124e3d3feeef406f3f9406ebfcc5f4076c736b6885e09c42efabd6649359d0fbb56476b2d3a136a55feddf6789e116ca8b677b6da0b1037d80"

RPROVIDES:${PN} += "cmake-KF5NewStuffQuick \
knewstuff-quick-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
knewstuff-core-devel \
knewstuff-imports"

inherit rpm
