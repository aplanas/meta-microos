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

RPM_NAME = "apache2-mod_apparmor-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "6a06f2216d49d49a337d7b9e7db2fdd7b58ebabc24318c5956f46a1ddf785e0fe4be11e3af4bbf94d6a6afc91b7c36baba17134c3c024c5c5812753a95f055b8"

RPROVIDES:${PN} += "apache2-mod-apparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6"

inherit rpm
