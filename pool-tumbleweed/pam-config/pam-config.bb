SUMMARY = "Utility to modify common PAM configuration files"
DESCRIPTION = "pam-config is a command line utility to maintain the common PAM \
configuration files included by most PAM application configuration \
files. It can be used to configure a system for different network or \
hardware based authentication schemes. pam-config can also \
add/adjust/remove other PAM modules and their options."
LICENSE = "GPL-2.0-only"

PV = "2.8"

RPM_NAME = "pam-config-2.8-1.1.aarch64.rpm"
RPM_HASH = "e13d14af2a0993855e66be3d87d49e7ab081a17a9164be8eb2d8b5d905f766f3bbfa894845334e5c7b266d38a633724fef3047cc1b71756058d93ba95569b9d1"

RPROVIDES:${PN} += "config-pam-config \
pam-config"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pam"

inherit rpm
