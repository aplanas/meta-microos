SUMMARY = "Ruby bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Ruby bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-ruby-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "c701df000eb308f761e77b8c3593d2afd2bee698251d5cc0e45842d64a721454031a999f49cb725aa498ef7a182d467663e1f0419a27e446cbdabbe3f27216a9"

RPROVIDES:${PN} += "openwsman-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
ruby \
ruby-abi"

inherit rpm
