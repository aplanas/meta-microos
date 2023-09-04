SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knewstuff-core-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "7dea30a5d3142117416435364e586eea61eb8626d0f1efe5a1d01eadf26453a8a94ff625c6b075168b4d996d1133c6dddf77ba53a8f65a11e677feb3d56692a7"

RPROVIDES:${PN} += "cmake-KF5NewStuffCore \
knewstuff-core-devel"

RDEPENDS:${PN} += "cmake-KF5Attica \
extra-cmake-modules \
libKF5NewStuffCore5"

inherit rpm
