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

RPM_NAME = "apache2-mod_apparmor-3.1.6-2.2.aarch64.rpm"
RPM_HASH = "fe833f3dc710beb976f3366fe58c8abcd3f82b5be46d5f1bbb09bd509a445e54d50659a53ef4bfeedee74977982caa88bd3ba4bd2a0541f7a46115b0cb4236c2"

RPROVIDES:${PN} += "apache2-mod-apparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6"

inherit rpm
