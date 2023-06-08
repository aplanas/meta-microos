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

PV = "3.1.3"

RPM_NAME = "apache2-mod_apparmor-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "003f53ac8b9cd0887031de6ee3349b36924429b83d1a8ab387a3b5aa0055f523d8f2a7ebfb03a51c89fcf2d2f785242e81da91c5dd7bd8e4eea8122881f26fa2"

RPROVIDES:${PN} += "apache2-mod_apparmor apache2-mod_apparmor(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
