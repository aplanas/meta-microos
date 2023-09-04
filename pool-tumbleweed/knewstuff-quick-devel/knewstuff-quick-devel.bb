SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knewstuff-quick-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "a2d77e6fef310ed25db2aee90a0c1ba62a1233e16f004f5a09b084980cddaa064c05adb4838d4e397d5624bdc76d3c8233bf7030b68343dbe56f5e5e080e68d0"

RPROVIDES:${PN} += "cmake-KF5NewStuffQuick \
knewstuff-quick-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
knewstuff-core-devel \
knewstuff-imports"

inherit rpm
