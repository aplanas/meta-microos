SUMMARY = "Platform support library used by libCEC and binary add-ons for Kodi"
DESCRIPTION = "Platform support library used by libCEC and binary add-ons for Kodi."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0.1"

RPM_NAME = "libp8-platform2-2.1.0.1-3.13.aarch64.rpm"
RPM_HASH = "ab08deffb080029a3b370cf9b3b451c9d3ebbb55490752f30c7d91e808c77b64aba60f4303f5c16e58133f48289e50d1b13b5f23d3fad0241d505bff27351625"

RPROVIDES:${PN} += "libp8-platform.so.2 \
libp8-platform2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
