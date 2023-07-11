SUMMARY = "Firmware files for the URSP1 SDR"
DESCRIPTION = "Firmware files for the USRP1 SDR."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "usrp-firmware-3.4.7-1.5.noarch.rpm"
RPM_HASH = "a1f1b1cc8ec09bd74f0b21a86ee34e089ce131c04927b9bc606138118aa40b9e73adad32d2d11f2f6d0c4a4209ba9edc83d41f2f59115151e6bcfe428462ceaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "usrp-firmware"

RDEPENDS:${PN} += "usrp-tools"

inherit rpm
