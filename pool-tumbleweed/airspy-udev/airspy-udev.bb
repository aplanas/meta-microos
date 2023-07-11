SUMMARY = "Udev rules for Airspy SDR"
DESCRIPTION = "Udev rules for Airspy SDR"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-udev-1.0.10-1.9.aarch64.rpm"
RPM_HASH = "5badc9e15818ff5eda1f9e84591bc64f4193980d4adf091540d6df1633e8d024646bd2f26f265893936ad458fa9d39902bb14d739901652a5a881e56b05a8b21"

RPROVIDES:${PN} += "airspy-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
