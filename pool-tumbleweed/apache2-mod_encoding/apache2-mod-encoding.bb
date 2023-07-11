SUMMARY = "Non-ASCII filename interoperability module for the Apache web server"
DESCRIPTION = "mod_encoding is an Apache module for improved non-ASCII filename \
interoperability (and for mod_dav)."
LICENSE = "OpenSSL"

PV = "0.0.20021209"

RPM_NAME = "apache2-mod_encoding-0.0.20021209-1.28.aarch64.rpm"
RPM_HASH = "9df0255c909e68034b1af5bf4255deec045cfeb5f2666b9f15ecb2e536208bca4104d18ab447966b984489a2fe621734c7de89a1a1caa2f1d447356e59f0cf14"

RPROVIDES:${PN} += "apache2-mod-encoding \
config-apache2-mod-encoding"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libiconv-hook.so.1 \
suse-maintenance-mmn-0"

inherit rpm
