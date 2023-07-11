SUMMARY = "GSSAPI authentication in lighttpd"
DESCRIPTION = "A module to provide GSSAPI authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_gssapi-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "7d508d89e3f7b60d37cc8265e37b74dbc94bdbc3ca1e146b74510066a0e62d5b37b9b5512f10a7c02d57972d3138becfd583590e32e06437e980458c04787916"

RPROVIDES:${PN} += "lighttpd-mod-authn-gssapi"

RDEPENDS:${PN} += "libc.so.6 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
lighttpd"

inherit rpm
