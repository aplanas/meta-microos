SUMMARY = "Configuration file parser library"
DESCRIPTION = "dotconf is a configuration-file parser \
library written in C. The configuration files created for dotconf look \
similar to those used by the Apache web server. Even \
container directives known from httpd.conf can be used in the \
same manner as for Apache modules. It supports various types of \
arguments, dynamically loadable modules that create their own \
configuration options on-the-fly, a here-documents feature to pass \
long ARG_STR data to programs, and on-the-fly inclusion of additional \
config files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "libdotconf0-1.3-16.9.aarch64.rpm"
RPM_HASH = "90289181b4d5481f32cd3b6a18fd856e40e1e8b52bdcddfab7236dc37f6e89e807f9c47ee3f5d9e12aa4d192699c4a78f56f6301a3e0a19bdabf59a92e4b8b17"

RPROVIDES:${PN} += "libdotconf-1-0-0 \
libdotconf.so.0 \
libdotconf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
