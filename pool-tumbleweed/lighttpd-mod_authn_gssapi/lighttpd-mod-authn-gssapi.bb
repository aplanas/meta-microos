SUMMARY = "GSSAPI authentication in lighttpd"
DESCRIPTION = "A module to provide GSSAPI authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_gssapi-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "25c4b4345d5997bec6aa379d92b299e29b4f6f00c9fd4de0fcabe8960332fff6a5f39ceca8da0daf6b6f1fdc15558df80e5e15d7d20d4444f7069d8d91e496b0"

RPROVIDES:${PN} += "lighttpd-mod_authn_gssapi \
lighttpd-mod_authn_gssapi(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
lighttpd"

inherit rpm
