SUMMARY = "GSSAPI Module for Apache"
DESCRIPTION = "This module has been built as a replacement for the aging \
mod_auth_kerb. Its aim is to use only GSSAPI calls and be \
as much as possible agnostic of the actual mechanism used."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "apache2-mod_auth_gssapi-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "b8f0fbfa8ff22ee09b8121b57b7ee40d3061b3b90a650346183f284b889a891cec78c7a9478e485dda0d16db796b980c59d7bb59b69185b1d5d973f66bcfa4ce"

RPROVIDES:${PN} += "apache2-mod-auth-gssapi"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
suse-maintenance-mmn-0"

inherit rpm
