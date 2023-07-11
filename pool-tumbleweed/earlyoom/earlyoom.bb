SUMMARY = "Early OOM Daemon for Linux"
DESCRIPTION = "earlyoom checks the amount of available memory and free swap, and if both are \
below critical level, it will kill the largest process (highest oom_score)."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "earlyoom-1.7-1.4.aarch64.rpm"
RPM_HASH = "8dc81d6869111cc5d77d855893452b450b3c21ee39903857f41ddc0fe756787a5299d5e5a83b4531e2c0324367803dd739d82ea785da7361d7f2bd786bd691e7"

RPROVIDES:${PN} += "earlyoom"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
