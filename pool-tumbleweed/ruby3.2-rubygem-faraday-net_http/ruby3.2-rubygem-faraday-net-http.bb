SUMMARY = "Faraday adapter for Net::HTTP"
DESCRIPTION = "Faraday adapter for Net::HTTP."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "ruby3.2-rubygem-faraday-net_http-3.0.2-1.3.aarch64.rpm"
RPM_HASH = "30d9ede0b0008867e756f1ada849ba87dda735f878a3f284a343f82680ffc50865daffac4a8104376cc1409de544809cc2ab5c5593abeab62fc72ed0a79b305e"

RPROVIDES:${PN} += "ruby3.2-rubygem-faraday-net-http \
rubygem-faraday-net-http \
rubygem-ruby-3.2.0-faraday-net-http \
rubygem-ruby-3.2.0-faraday-net-http-3 \
rubygem-ruby-3.2.0-faraday-net-http-3.0 \
rubygem-ruby-3.2.0-faraday-net-http-3.0.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
