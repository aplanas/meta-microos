SUMMARY = "Udev rules for HackRF"
DESCRIPTION = "Udev rules for HackRF."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-udev-2023.01.1-1.3.aarch64.rpm"
RPM_HASH = "eb50bf9d31c6006c7893e26f49c9ff50d61d0e8d80e61a99c4b9eba7250d8bb02071e370823cf8390304f67c4dc1034e4ce18ea711b3feb16dc9ebea4ea6ae97"

RPROVIDES:${PN} += "hackrf-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
