SUMMARY = "Run ASP.NET Pages on Unix with Apache and Mono"
DESCRIPTION = "mod_mono is a module that interfaces Apache with Mono and allows \
running ASP.NET pages on Unix and Unix-like systems. To load the module \
into Apache, run the command 'a2enmod mono' as root."
LICENSE = "Apache-2.0"

PV = "3.13"

RPM_NAME = "apache2-mod_mono-3.13-1.10.aarch64.rpm"
RPM_HASH = "94a184313a95346372ac003dc845375f77d20b07de4d1a0d328ded0c27dea856d0d5963b3fa2ab38b53faf437c30f19029cee0e72913c7f0c7fc2f53f0908ad3"

RPROVIDES:${PN} += "apache2-mod-mono \
config-apache2-mod-mono \
mod-mono"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
xsp"

inherit rpm
