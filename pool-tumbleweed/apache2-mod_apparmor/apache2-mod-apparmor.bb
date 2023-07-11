SUMMARY = "AppArmor module for apache2"
DESCRIPTION = "apache2-modapparmor adds support to apache2 to provide AppArmor \
confinement to individual cgi scripts handled by apache modules like \
mod_php and mod_perl. \
 \
This package is part of a suite of tools that used to be named \
SubDomain. \
 \
The documentation is in the apparmor-admin_en package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apache2-mod_apparmor-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "c2975970093bc43ced6e0ef0c9a2819a671d25404c07a86f351745c36ec3ee8de26a6972c648328c115da2463b1a59ee90248b2f50648c912b79db9465c718d3"

RPROVIDES:${PN} += "apache2-mod-apparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6"

inherit rpm
