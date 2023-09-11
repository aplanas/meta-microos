SUMMARY = "Zero-configuration fan control daemon for ThinkPads"
DESCRIPTION = "Zero-configuration fan control daemon for ThinkPads with watchdog \
support and automatic temperature- and time-based hysteresis (no \
bouncing between fan levels)."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "zcfan-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "8690821b2f39fe41eb7bfbbec49546c06c1f3426defedce9ee2c6747aa36101bbdf246c5214ebc81c945e8025a7503d99839911bd793584e1740115c97f0afd6"

RPROVIDES:${PN} += "zcfan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
