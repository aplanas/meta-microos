SUMMARY = "Udev rules for bladeRF"
DESCRIPTION = "Udev rules for bladeRF."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2023.02"

RPM_NAME = "bladeRF-udev-2023.02-16.4.aarch64.rpm"
RPM_HASH = "7107b7ed927a4fbd8f12ff4860951d3175e8232e9475c8d69f297ada268e250390163ef082d05409d817f428662406ddb978cb4a3aa354c182d1871db3cbe49f"

RPROVIDES:${PN} += "bladeRF-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
