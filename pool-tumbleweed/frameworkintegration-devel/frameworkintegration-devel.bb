SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "frameworkintegration-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "11ea25f6bf8a64034a62b57d72bc7c020dbf4cf3a0f42af57e316a6cde8f820fb391b5915a973a8a7eb4b0d5cc253cf999f8739e110533c8c5510c5f1da6dce4"

RPROVIDES:${PN} += "cmake-KF5FrameworkIntegration \
frameworkintegration-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5IconThemes \
extra-cmake-modules \
libKF5Style5"

inherit rpm
