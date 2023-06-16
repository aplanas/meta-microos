SUMMARY = "Client for One Drive Service for Linux"
DESCRIPTION = "OneDrive is a client for Microsoft file serving service"
LICENSE = "GPL-3.0-only"

PV = "2.4.23"

RPM_NAME = "onedrive-2.4.23-1.4.aarch64.rpm"
RPM_HASH = "a6e7349fcc698fc46d66e79c6f9e7a88e032fab0e5b0d1969873a3b45d136ee8b5360a4b9b29fb1f5154d133510b19fb9977ef8a5d0bb312bb460af97c07e7cf"

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
