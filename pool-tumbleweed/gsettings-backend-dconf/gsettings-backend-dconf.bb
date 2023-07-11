SUMMARY = "GSettings integration of the dconf key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems. \
 \
This package provides a GSettings backend that uses dconf to store \
the settings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "gsettings-backend-dconf-0.40.0-3.4.aarch64.rpm"
RPM_HASH = "62dc2d405cf8445676ac6b34e1869e0acb65defbfe02cf0c198f8703bcaf48d7f35263329bac09535142810aeb9702bb7487b69e3f7e039a8cabf2520185e744"

RPROVIDES:${PN} += "gsettings-backend-dconf \
libdconfsettings.so"

RDEPENDS:${PN} += "/usr/bin/sh \
dconf \
glib2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
