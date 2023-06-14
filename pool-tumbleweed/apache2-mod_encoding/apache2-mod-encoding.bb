SUMMARY = "Non-ASCII filename interoperability module for the Apache web server"
DESCRIPTION = "mod_encoding is an Apache module for improved non-ASCII filename \
interoperability (and for mod_dav)."
LICENSE = "OpenSSL"

PV = "0.0.20021209"

RPM_NAME = "apache2-mod_encoding-0.0.20021209-1.27.aarch64.rpm"
RPM_HASH = "4d13fe976ef16816be392a2d7b5ecf74a8dddac6513d7fd9fb3eef12c233deccd5e004923a579268d61901ef9541e9af6575cb0928352610194c7c57c81a4176"

RPROVIDES:${PN} += "apache2-mod-encoding \
config-apache2-mod-encoding"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libiconv-hook.so.1 \
suse-maintenance-mmn-0"

inherit rpm
