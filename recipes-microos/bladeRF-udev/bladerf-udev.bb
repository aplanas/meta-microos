SUMMARY = "Udev rules for bladeRF"
DESCRIPTION = "Udev rules for bladeRF."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2023.02"

RPM_NAME = "bladeRF-udev-2023.02-16.3.aarch64.rpm"
RPM_HASH = "57b119995f9439c7a7193221393645192fe65ff70c8e8ff3bbdd99adfdb0f37648f9086231bfdd52c6c5bf71d002f891354ba1d87374e63e03e72b292fba5646"

RPROVIDES:${PN} += "bladeRF-udev bladeRF-udev(aarch-64)"
RDEPENDS:${PN} += "/bin/sh shadow"

inherit rpm
