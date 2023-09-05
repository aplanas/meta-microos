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

RPM_NAME = "apache2-mod_apparmor-3.1.6-4.1.aarch64.rpm"
RPM_HASH = "e4b9005bc50047b365291c29a558c985032803711cbc20c40436fb937f061b7bbe303a66c6ade391bf9c3f26691f4608e7c7052111b2a6ddb7ef2637716c2a85"

RPROVIDES:${PN} += "apache2-mod-apparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6"

inherit rpm
