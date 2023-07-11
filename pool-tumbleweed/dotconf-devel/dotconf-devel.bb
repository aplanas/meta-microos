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

RPM_NAME = "dotconf-devel-1.3-16.9.aarch64.rpm"
RPM_HASH = "a2dfc4369810a57be6eca08b7ee2a07f8da798fa01495b5d8dbdb26a9223a76019e3bcd6187a757cb1cc7c793d987e40235b2ec5d33aa28a861aa47648a828ce"

RPROVIDES:${PN} += "dotconf \
dotconf-devel \
pkgconfig-dotconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdotconf0"

inherit rpm
