SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knewstuff-core-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "04cfe4d0239273c578c65b6b86aa95abde1b99addb982e7e87fd1e1c6149725d8a3d9dc6375ba1ae5b397ba6bc35037e0940d87445986bd943fa60bb0ebab34b"

RPROVIDES:${PN} += "cmake-KF5NewStuffCore \
knewstuff-core-devel"

RDEPENDS:${PN} += "cmake-KF5Attica \
extra-cmake-modules \
libKF5NewStuffCore5"

inherit rpm
