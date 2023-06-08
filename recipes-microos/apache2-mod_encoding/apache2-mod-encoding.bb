SUMMARY = "Non-ASCII filename interoperability module for the Apache web server"
DESCRIPTION = "mod_encoding is an Apache module for improved non-ASCII filename \
interoperability (and for mod_dav)."
LICENSE = "OpenSSL"

PV = "0.0.20021209"

RPM_NAME = "apache2-mod_encoding-0.0.20021209-1.27.aarch64.rpm"
RPM_HASH = "4d13fe976ef16816be392a2d7b5ecf74a8dddac6513d7fd9fb3eef12c233deccd5e004923a579268d61901ef9541e9af6575cb0928352610194c7c57c81a4176"

RPROVIDES:${PN} += "apache2-mod_encoding apache2-mod_encoding(aarch-64) config(apache2-mod_encoding)"
RDEPENDS:${PN} += "apache2 apache_mmn_20120211 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libiconv_hook.so.1()(64bit) suse_maintenance_mmn_0"

inherit rpm
