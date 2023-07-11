SUMMARY = "Base Package for Integrated Development Environments: Build Environment"
DESCRIPTION = "This package contains the development files for building integrated \
developments environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdevplatform-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e04a799ac51bd3de967af80293e4e3856aa3cf8702a1cc6d6434941a47618efebedb894c51645f3ab0327035549f1099abc57fc9faaf28c523ab10bb11f9977a"

RPROVIDES:${PN} += "cmake-KDevPlatform \
kdevplatform-devel"

RDEPENDS:${PN} += "cmake-KF5TextEditor \
cmake-KF5ThreadWeaver \
libkdevplatform511"

inherit rpm
