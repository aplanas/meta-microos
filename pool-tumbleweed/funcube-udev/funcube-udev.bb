SUMMARY = "Udev rules for FCD and FCDpro Plus devices"
DESCRIPTION = "Udev rules for FCD and FCDpro Plus devices."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "funcube-udev-3.10.0.rc3-1.3.noarch.rpm"
RPM_HASH = "6b33a08e3ce42d892e595cffc889e648245ffe39e5400c288873d26da9ac42824dae65ab76025a716bac7d8d21f15b049a4a06d8a665c9793f188ec122e951e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "funcube-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
