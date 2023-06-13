SUMMARY = "Build of mod_auth_mellon with diagnostic logging"
DESCRIPTION = "Build of mod_auth_mellon with diagnostic logging. See README.diagnostics \
in the doc directory for instructions on using the diagnostics build."
LICENSE = "GPL-2.0-or-later"

PV = "0.17.0"

RPM_NAME = "apache2-mod_auth_mellon-diagnostics-0.17.0-2.9.aarch64.rpm"
RPM_HASH = "9743144537be38e6463674741871db39ced2cde64cb92ef641ae83156f3274f630a22ed9136191ed695fdb99f1a7efd3f21e7a4a2b991610545c0ad2c385101e"

RPROVIDES:${PN} += "apache2-mod_auth_mellon-diagnostics \
apache2-mod_auth_mellon-diagnostics(aarch-64)"

RDEPENDS:${PN} += "apache2-mod_auth_mellon \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
liblasso.so.3()(64bit)"

inherit rpm
