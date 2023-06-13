SUMMARY = "Data Files for USB Modeswitch"
DESCRIPTION = "Data files for usb_modeswitch package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "usb_modeswitch-data-2.6.1-2.6.noarch.rpm"
RPM_HASH = "6f979b4ef0c73cf221f7cfdc6efa15a782eb6b832c74e6f4b753bd06fdc447a32afd790c8e2f663b73c36995b6b821cda17893e519024311d911fd45e449d1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "usb_modeswitch-data"

RDEPENDS:${PN} += "usb_modeswitch"

inherit rpm
