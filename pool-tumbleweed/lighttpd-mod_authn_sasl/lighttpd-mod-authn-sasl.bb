SUMMARY = "SASL authentication in lighttpd"
DESCRIPTION = "A module to provide SASL authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_sasl-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "8fa827def404c9ba6202c03af8b59a36f4b0cbbe6bf9088c1381fd9bb30642d6cf4b771b5a13d482fce0588300cd182986499f56f2b8b205ceafcb8fa32b2978"

RPROVIDES:${PN} += "lighttpd-mod-authn-sasl"

RDEPENDS:${PN} += "libc.so.6 \
libsasl2.so.3 \
lighttpd"

inherit rpm
