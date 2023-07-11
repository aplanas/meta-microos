SUMMARY = "Data Files for USB Modeswitch"
DESCRIPTION = "Data files for usb_modeswitch package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "usb_modeswitch-data-2.6.1-2.7.noarch.rpm"
RPM_HASH = "c3492525022b98350cb38572323bdb95562f4fe222cfc8cd93d528e6efac188fb345a617690fa24ff5e161375e368f5b61b15cea7c9e25d5f256086cf19b9a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "usb-modeswitch-data"

RDEPENDS:${PN} += "usb-modeswitch"

inherit rpm
