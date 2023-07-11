SUMMARY = "Firmware for the hackRF board"
DESCRIPTION = "Firmare files for the hackRF board."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-firmware-2023.01.1-1.3.noarch.rpm"
RPM_HASH = "54ccb147fa000aebf148a05c54bb7e7c0ce2cc98e24d2910fd9f07e4db1bdd49e91fe2111390032d09d11afd331d917a506f0580432eb669ab65aadbc50315a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hackrf-firmware"

RDEPENDS:${PN} += "hackrf"

inherit rpm
