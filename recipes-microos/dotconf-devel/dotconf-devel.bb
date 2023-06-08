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

RPM_NAME = "dotconf-devel-1.3-16.8.aarch64.rpm"
RPM_HASH = "6bd460dcb8c233f073dffb4ef74b50a779313c679949584b974eccfcbc299b9172fd0f3722896c1e4228bf7734e2958fe4679a4cfc63fe0b38e312723a4c2e1c"

RPROVIDES:${PN} += "dotconf dotconf-devel dotconf-devel(aarch-64) pkgconfig(dotconf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdotconf0"

inherit rpm
