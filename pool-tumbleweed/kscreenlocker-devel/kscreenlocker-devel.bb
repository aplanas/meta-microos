SUMMARY = "Library and components for secure lock screen architecture - development files"
DESCRIPTION = "Development files for Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kscreenlocker-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "2818ef69c77c60853f80e2c02339a704548b9c20cb68dfefb581fe399b067e3c82f598df543a19d8e8c1b1d4cd307040343ae447adfdb8290d96b16bc930237a"

RPROVIDES:${PN} += "cmake-KScreenLocker \
cmake-ScreenSaverDBusInterface \
kscreenlocker-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5X11Extras \
libKScreenLocker5"

inherit rpm
