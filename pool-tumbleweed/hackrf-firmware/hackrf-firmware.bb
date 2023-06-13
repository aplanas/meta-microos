SUMMARY = "Firmware for the hackRF board"
DESCRIPTION = "Firmare files for the hackRF board."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-firmware-2023.01.1-1.2.noarch.rpm"
RPM_HASH = "35d6ad9b1e2c8a0478f636dc26441aa90d2839ad260c06d399d2e344408c92c26fce4406a3f7a6fed5a95c304ae545e1c8e0019c7a96200b9fb4e040f61a0096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hackrf-firmware"

RDEPENDS:${PN} += "hackrf"

inherit rpm
