SUMMARY = "Utility to Set/Show the Host Name or Domain Name"
DESCRIPTION = "This package provides commands which can be used to display the system's DNS \
name, and to display or set its hostname or NIS domain name."
LICENSE = "GPL-2.0-or-later"

PV = "3.23"

RPM_NAME = "hostname-3.23-3.1.aarch64.rpm"
RPM_HASH = "1023f658ff76d9c40048c57578e865be6a26a2b5d6bcfb592cf2f9e8619dcb467f1d2557292b98a662e9dbf89bdbaf431b17c666e7b1f38e372ac55d09652658"

RPROVIDES:${PN} += "/bin/hostname \
hostname"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
