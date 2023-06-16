SUMMARY = "System services for using fcgiwrap with nginx"
DESCRIPTION = "This package provides systemd unit files to run a set of fcgiwrap \
processes ready for use with nginx or other web servers."
LICENSE = "MIT"

PV = "1.1.0+18+g99c942c"

RPM_NAME = "fcgiwrap-nginx-1.1.0+18+g99c942c-3.12.aarch64.rpm"
RPM_HASH = "f3a1fee372c18dc28e61dc7243787864cb055e18e0e76000ec919e292fce691a6e05932482b7458d67ae24b2ee16a11e52e08393d82b2271ff099fceb9386c64"

RPROVIDES:${PN} += "fcgiwrap-nginx"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
fcgiwrap \
nginx"

inherit rpm
