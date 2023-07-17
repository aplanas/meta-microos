SUMMARY = "Interactive Connectivity Establishment implementation"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "libnice10-0.1.21-3.1.aarch64.rpm"
RPM_HASH = "c0a2d43d726016a473b131e29fc97ce5818275bbaed4b0dea92ecff8e81c6b6b5bbddc874a85578942c87b8adb1841f3fbd85b456bc36d87dc896a1708f1bbca"

RPROVIDES:${PN} += "libnice.so.10 \
libnice10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgupnp-igd-1.6.so.0"

inherit rpm
