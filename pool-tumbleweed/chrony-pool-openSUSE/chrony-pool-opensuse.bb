SUMMARY = "Chrony preconfiguration for openSUSE"
DESCRIPTION = "This package configures chrony to use the openSUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.3"

RPM_NAME = "chrony-pool-openSUSE-4.3-2.4.noarch.rpm"
RPM_HASH = "334deeac92972ef0b90bf7ef52255854ba2dae5be9c5af64327856152720f30c8d506e15daedc6ea2fb61361a54e5c347b3d83d28ffe097764c3b01e76a41e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-nonempty \
chrony-pool-openSUSE \
config-chrony-pool-openSUSE"

RDEPENDS:${PN} += "chrony"

inherit rpm
