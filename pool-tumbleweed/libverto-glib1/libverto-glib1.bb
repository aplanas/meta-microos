SUMMARY = "Backend module for libverto -- glib"
DESCRIPTION = "Module for libverto which provides integration with glib. \
 \
This package does NOT yet provide libverto-module-base."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-glib1-0.3.2-3.1.aarch64.rpm"
RPM_HASH = "c1fec4f8289148b24ac9b2af202d6afacb2786baa43a9df71a4bdcf4f327886c4bb254b523744a0f763622a22a7bcf1064efd869402188c924391051d414ba3f"

RPROVIDES:${PN} += "libverto-glib.so.1 \
libverto-glib1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libverto.so.1 \
libverto1"

inherit rpm
