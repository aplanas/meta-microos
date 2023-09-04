SUMMARY = "Ruby bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Ruby bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-ruby-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "464af4de864a2583d118686d3a05b43f7153bba775d20b48410d8ea98b87f2b281cf8d9d62080759b569f6283801d09730efb061b6e2cbddb6f4fd82e67da9a2"

RPROVIDES:${PN} += "openwsman-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
ruby \
ruby-abi"

inherit rpm
