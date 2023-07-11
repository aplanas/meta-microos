SUMMARY = "System services for using fcgiwrap with nginx"
DESCRIPTION = "This package provides systemd unit files to run a set of fcgiwrap \
processes ready for use with nginx or other web servers."
LICENSE = "MIT"

PV = "1.1.0+18+g99c942c"

RPM_NAME = "fcgiwrap-nginx-1.1.0+18+g99c942c-3.13.aarch64.rpm"
RPM_HASH = "374c51a11209224353f039c6a7fab772589dce8a758f84c3030c8cea8e9da17b56b1ff3807f529ad63d5fd90638610a3575b9b290710172ce1c96f05c329216b"

RPROVIDES:${PN} += "fcgiwrap-nginx"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
fcgiwrap \
nginx"

inherit rpm
