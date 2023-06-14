SUMMARY = "Udev rules for Linux Kernel PPS"
DESCRIPTION = "Udev rules for Linux Kernel PPS."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.0+git.20211122"

RPM_NAME = "pps-udev-0.0.0+git.20211122-1.2.aarch64.rpm"
RPM_HASH = "413233bd7904cdd70138a4bc56ecfb5251fc339011933533149d4ec0516a4c311508d07e5a6c980719429016c1c30217535919d9190a304622b5c45c36de1362"

RPROVIDES:${PN} += "pps-udev"

RDEPENDS:${PN} += "/bin/sh \
user-ntp"

inherit rpm
