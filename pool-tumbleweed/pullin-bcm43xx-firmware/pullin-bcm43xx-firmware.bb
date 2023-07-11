SUMMARY = "download broadcom firmware files"
DESCRIPTION = "automatically download broadcom firmware files needed for bcm43xx WLAN chips"
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "pullin-bcm43xx-firmware-1.0-4.9.noarch.rpm"
RPM_HASH = "8dc683dca7cb7a55ebec39bc36bbf09e928818b4e8ca28c605854624adf1562a54bb4109915b2c34c409f452e042bcd7da129357c989a55d30d59ed3fe1bb2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pullin-bcm43xx-firmware"

RDEPENDS:${PN} += "/usr/bin/sh \
b43-fwcutter \
pciutils"

inherit rpm
