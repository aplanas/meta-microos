SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knewstuff-core-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "760f191d4b6eddd9f996729876503c6ce1840e87bd6a84a499af567404880b7d1cb1fc8ce6aab8d195d153797fac2933c4ef78527989d2598f66abe86fc0376b"

RPROVIDES:${PN} += "cmake-KF5NewStuffCore \
knewstuff-core-devel"

RDEPENDS:${PN} += "cmake-KF5Attica \
extra-cmake-modules \
libKF5NewStuffCore5"

inherit rpm
