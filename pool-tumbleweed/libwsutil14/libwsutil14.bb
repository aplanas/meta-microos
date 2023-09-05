SUMMARY = "Library for wireshark utilities"
DESCRIPTION = "The libwsutil library provides utility functions for libwireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.8"

RPM_NAME = "libwsutil14-4.0.8-2.1.aarch64.rpm"
RPM_HASH = "04653a610e3fc32e3f0a5c3d1c4289693e8398760033eab5dcf146517954fe8a98b46297191db207c391e92c9295ffd7e95cc2c9e2799b229a079702a1fdabba"

RPROVIDES:${PN} += "libwsutil.so.14 \
libwsutil14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libpcre2-8.so.0"

inherit rpm
