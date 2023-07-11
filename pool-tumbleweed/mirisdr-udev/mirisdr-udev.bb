SUMMARY = "Udev rules for Mirics MRi2500 based DVB dongles"
DESCRIPTION = "Udev rules for Mirics MRi2500 based DVB dongles."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "mirisdr-udev-0.0.0+git.20130608-1.25.aarch64.rpm"
RPM_HASH = "fc17ce0ef6aa52913fcf9dd46f103e1f292843ac3b5fa52493e150a5f00377f8aa87597dcad7e23ff0d5495f16b61b135f2381985c698973d5a1ad5e2c37925c"

RPROVIDES:${PN} += "mirisdr-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
