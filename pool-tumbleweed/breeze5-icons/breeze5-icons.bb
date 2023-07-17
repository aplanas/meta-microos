SUMMARY = "Breeze icon theme"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme."
LICENSE = "LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "breeze5-icons-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "44244bcd20f048ccea170a8c5604340445feacb6fef72e3494848892853ecdd9663ca89e9646a51396d61e2ef10b922948c8d5453bedea3ffd930b475b95df72"

RPROVIDES:${PN} += "breeze5-icons \
cmake-KF5BreezeIcons"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
