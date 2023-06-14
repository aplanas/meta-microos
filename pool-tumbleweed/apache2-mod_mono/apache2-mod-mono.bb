SUMMARY = "Run ASP.NET Pages on Unix with Apache and Mono"
DESCRIPTION = "mod_mono is a module that interfaces Apache with Mono and allows \
running ASP.NET pages on Unix and Unix-like systems. To load the module \
into Apache, run the command 'a2enmod mono' as root."
LICENSE = "Apache-2.0"

PV = "3.13"

RPM_NAME = "apache2-mod_mono-3.13-1.9.aarch64.rpm"
RPM_HASH = "4079d9aa5d069dd1f27196ac7dc9f773a0aece419991ec891653f14fd569ac6073a1552418c1787529fec215e0e7b2cad1c1d7d058d3e9148231f367f5784889"

RPROVIDES:${PN} += "apache2-mod-mono \
config-apache2-mod-mono \
mod-mono"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
xsp"

inherit rpm
