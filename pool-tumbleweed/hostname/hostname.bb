SUMMARY = "Utility to Set/Show the Host Name or Domain Name"
DESCRIPTION = "This package provides commands which can be used to display the system's DNS \
name, and to display or set its hostname or NIS domain name."
LICENSE = "GPL-2.0-or-later"

PV = "3.23"

RPM_NAME = "hostname-3.23-3.2.aarch64.rpm"
RPM_HASH = "a804491f005b3431330d12c25a1e9d4e8fe06fae5f27ab11d5e74871daecb10afbdb7954ff0df988dcbd05efd0518ccf7e604d8d9c60f3b88887825cfcc4e686"

RPROVIDES:${PN} += "/usr/bin/hostname \
hostname"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
