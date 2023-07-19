SUMMARY = "KF5 extension for mediainfo-gui"
DESCRIPTION = "KF5 context menu extension for mediainfo-gui."
LICENSE = "GPL-2.0-or-later"

PV = "23.07"

RPM_NAME = "kf5-mediainfo-23.07-1.1.aarch64.rpm"
RPM_HASH = "6f0304f83672dc00c8a76adf2518883470cc097be09fc0ddfc17045270f1b5d6999fddef3b46ac9ff83afe7f2a71101e90ca3d739d713fdf22e78823c2cebccf"

RPROVIDES:${PN} += "kde4-mediainfo \
kf5-mediainfo"

RDEPENDS:${PN} += "mediainfo-gui"

inherit rpm
