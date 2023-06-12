SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knewstuff-core-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "fb96fc13fbc161e03590e0e0ca3c593a303f428868e67598a9515ce41d1e03875c463608faef3556658745445070d70249d7bd8c4f264156c24425e18699ca74"

RPROVIDES:${PN} += "cmake(KF5NewStuffCore) \
knewstuff-core-devel \
knewstuff-core-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Attica) \
extra-cmake-modules \
libKF5NewStuffCore5"

inherit rpm
