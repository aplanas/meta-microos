SUMMARY = "GSSAPI Module for Apache"
DESCRIPTION = "This module has been built as a replacement for the aging \
mod_auth_kerb. Its aim is to use only GSSAPI calls and be \
as much as possible agnostic of the actual mechanism used."
LICENSE = "MIT"

PV = "1.6.3"

RPM_NAME = "apache2-mod_auth_gssapi-1.6.3-2.8.aarch64.rpm"
RPM_HASH = "c911ca6a81eb0d2c46a092158c54685c282560de57edeb7cf4c3c7f6e18fde68f2338158de0bd16c333eec46bd41e8e084f6f06328dedcfe1bd47db53b2292e3"

RPROVIDES:${PN} += "apache2-mod_auth_gssapi \
apache2-mod_auth_gssapi(aarch-64)"
RDEPENDS:${PN} += "apache2 \
apache_mmn_20120211 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
suse_maintenance_mmn_0"

inherit rpm
