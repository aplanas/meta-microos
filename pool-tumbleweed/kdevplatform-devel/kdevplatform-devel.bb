SUMMARY = "Base Package for Integrated Development Environments: Build Environment"
DESCRIPTION = "This package contains the development files for building integrated \
developments environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdevplatform-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "76b54aed6fbe30faac81bb5293d4ced6f367a441b71c8dda800bc0a0054046d7e10041fcb666dc155e209148a1edfb76231ea5b6799be5b65c54900966e00083"

RPROVIDES:${PN} += "cmake-KDevPlatform \
kdevplatform-devel"

RDEPENDS:${PN} += "cmake-KF5TextEditor \
cmake-KF5ThreadWeaver \
libkdevplatform512"

inherit rpm
