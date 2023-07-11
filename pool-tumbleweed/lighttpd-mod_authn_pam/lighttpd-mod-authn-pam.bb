SUMMARY = "PAM authentication in lighttpd"
DESCRIPTION = "A module to provide PAM authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_pam-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "8433ba8b15fc9cbca9d5a9b04d8947bb6dd85293c253bec0a2d010e0efc36ab7e2210f27f173d5110f3af1351d929d2cb96cc2164cb8de59f264107c2d6c98c3"

RPROVIDES:${PN} += "lighttpd-mod-authn-pam"

RDEPENDS:${PN} += "libc.so.6 \
libpam.so.0 \
lighttpd"

inherit rpm
