SUMMARY = "Compatibility metapackage for X.Org video drivers"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org video drivers."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-driver-video-7.6_1-19.9.aarch64.rpm"
RPM_HASH = "4df1a2042d8826e784f6d406a89fda3bb0c3891130308d08d9c93658b2da0604fedfb953abd228eead02e169257d9ee15d8362bf7b1ca85bfbf43066e94c6bc3"

RPROVIDES:${PN} += "xorg-x11-driver-video \
xorg-x11-driver-video-radeonhd \
xorg-x11-driver-video-unichrome"

RDEPENDS:${PN} += "xf86-video-fbdev \
xorg-x11-server"

inherit rpm
