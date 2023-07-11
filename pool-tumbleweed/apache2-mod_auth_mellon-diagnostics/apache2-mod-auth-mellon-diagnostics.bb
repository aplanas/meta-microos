SUMMARY = "Build of mod_auth_mellon with diagnostic logging"
DESCRIPTION = "Build of mod_auth_mellon with diagnostic logging. See README.diagnostics \
in the doc directory for instructions on using the diagnostics build."
LICENSE = "GPL-2.0-or-later"

PV = "0.17.0"

RPM_NAME = "apache2-mod_auth_mellon-diagnostics-0.17.0-2.10.aarch64.rpm"
RPM_HASH = "9d20ab945733721f4f86c28c52cb29773513ceee2097aa999cd21269a58aaf1524599289d98a62052c191990c5c7b219d7ecd40f045018b8098ab3edb7014e18"

RPROVIDES:${PN} += "apache2-mod-auth-mellon-diagnostics"

RDEPENDS:${PN} += "apache2-mod-auth-mellon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libglib-2.0.so.0 \
liblasso.so.3"

inherit rpm
