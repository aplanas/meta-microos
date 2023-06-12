SUMMARY = "Udev rules for Airspy SDR"
DESCRIPTION = "Udev rules for Airspy SDR"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-udev-1.0.10-1.8.aarch64.rpm"
RPM_HASH = "749d2ac309058030cd2b112e8a9d2ca11fe5998efe45c038e897d4749280d83392ba4cdce7754f1ea6362f69d453a954d45362dd2a3ad2223495de9721b560b7"

RPROVIDES:${PN} += "airspy-udev \
airspy-udev(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
shadow"

inherit rpm
