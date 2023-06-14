SUMMARY = "GSSAPI Module for Apache"
DESCRIPTION = "This module has been built as a replacement for the aging \
mod_auth_kerb. Its aim is to use only GSSAPI calls and be \
as much as possible agnostic of the actual mechanism used."
LICENSE = "MIT"

PV = "1.6.3"

RPM_NAME = "apache2-mod_auth_gssapi-1.6.3-2.8.aarch64.rpm"
RPM_HASH = "c911ca6a81eb0d2c46a092158c54685c282560de57edeb7cf4c3c7f6e18fde68f2338158de0bd16c333eec46bd41e8e084f6f06328dedcfe1bd47db53b2292e3"

RPROVIDES:${PN} += "apache2-mod-auth-gssapi"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
suse-maintenance-mmn-0"

inherit rpm
