SUMMARY = "Udev rules for FCD and FCDpro Plus devices"
DESCRIPTION = "Udev rules for FCD and FCDpro Plus devices."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "funcube-udev-3.10.0.rc3-1.4.noarch.rpm"
RPM_HASH = "0da7d45a04016974b1de56cbead60a03ef384f83e9f592226b8c95d86e6795e9bc84c0d66e95a05e7ae44d8c0c35e169783827428bf9d2cc04a863c43dbedfe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "funcube-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
