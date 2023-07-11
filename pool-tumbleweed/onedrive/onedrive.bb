SUMMARY = "Client for One Drive Service for Linux"
DESCRIPTION = "OneDrive is a client for Microsoft file serving service"
LICENSE = "GPL-3.0-only"

PV = "2.4.25"

RPM_NAME = "onedrive-2.4.25-1.1.aarch64.rpm"
RPM_HASH = "1d9ca74e96f60e2f05f5cd81bbd5b5a8e7ecd4d61611158603e389f0f294a12d3efc93779dc99a7cc371d1f935fa874388df8432109853790fba2892c5752465"

RPROVIDES:${PN} += "config-onedrive \
onedrive"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libnotify4 \
libphobos2-ldc-shared.so.102 \
libsqlite3.so.0"

inherit rpm
