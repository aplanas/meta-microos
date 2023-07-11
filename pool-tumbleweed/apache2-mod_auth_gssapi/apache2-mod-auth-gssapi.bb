SUMMARY = "GSSAPI Module for Apache"
DESCRIPTION = "This module has been built as a replacement for the aging \
mod_auth_kerb. Its aim is to use only GSSAPI calls and be \
as much as possible agnostic of the actual mechanism used."
LICENSE = "MIT"

PV = "1.6.3"

RPM_NAME = "apache2-mod_auth_gssapi-1.6.3-2.9.aarch64.rpm"
RPM_HASH = "90700a9732e0309af7895ea9011ed6cd9075f26496b5a75f1c92e7b3b5ec16904c993d3fb3d60997fcaeb5e8938f095fdc537435b8b432381c7bf634b8adcdc2"

RPROVIDES:${PN} += "apache2-mod-auth-gssapi"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
suse-maintenance-mmn-0"

inherit rpm
