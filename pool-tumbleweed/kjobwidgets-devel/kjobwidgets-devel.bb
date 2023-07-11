SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kjobwidgets-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "5599b3a351d8e108e67d60628ace6a758959edabc65be2c528cf5f616af8c0bd2e307b7d0d3be014fbd23e560bb199a6e74da33d67638e51e59447578cc20d5a"

RPROVIDES:${PN} += "cmake-KF5JobWidgets \
kjobwidgets-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Widgets \
extra-cmake-modules \
libKF5JobWidgets5"

inherit rpm
