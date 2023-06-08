SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "frameworkintegration-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "cf63c1675bc6779ef277cf5226d01059f7480a8532550131bc871c381f1bbb0095734c6c0125a5647aa7e58f797277b7e71fd05018a6b72ed08e9a1cb5f828a1"

RPROVIDES:${PN} += "cmake(KF5FrameworkIntegration) frameworkintegration-devel frameworkintegration-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5ConfigWidgets) cmake(KF5IconThemes) extra-cmake-modules libKF5Style5"

inherit rpm
