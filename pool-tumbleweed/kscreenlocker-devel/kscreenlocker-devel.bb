SUMMARY = "Library and components for secure lock screen architecture - development files"
DESCRIPTION = "Development files for Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kscreenlocker-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "dfae0aa421b1725647ffe82754ab02402dca2c691612d427be0ad9829c0fcb7efaf1a285d549458554b9fb50f8dd4c9198771c80c0ebbfd3f78c0ab55f4b5432"

RPROVIDES:${PN} += "cmake(KScreenLocker) \
cmake(ScreenSaverDBusInterface) \
kscreenlocker-devel \
kscreenlocker-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
cmake(Qt5X11Extras) \
libKScreenLocker5"

inherit rpm
