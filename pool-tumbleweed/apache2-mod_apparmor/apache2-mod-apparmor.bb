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

PV = "3.1.4"

RPM_NAME = "apache2-mod_apparmor-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "e95d1561cce4fe71963b2b7ec46b7dc62e183547eb9458bdcc369cd2fd1ddcdaf2be1a26d18599025ee5b32a754b7953b31a0445a29219b3bce338116e38955c"

RPROVIDES:${PN} += "apache2-mod-apparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6"

inherit rpm
