SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knewstuff-quick-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e34d71b8638f50630171907559bead60a621f5d3fe95773c374b64f4f4d46ef7640f1a637c75b7f71dbaf0ac952d89e7d6c4b3a55fe6e899db1a3a6111783c8d"

RPROVIDES:${PN} += "cmake-KF5NewStuffQuick \
knewstuff-quick-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
knewstuff-core-devel \
knewstuff-imports"

inherit rpm
