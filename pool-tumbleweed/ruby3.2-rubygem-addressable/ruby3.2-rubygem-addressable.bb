SUMMARY = "URI Implementation"
DESCRIPTION = "Addressable is an alternative implementation to the URI implementation that is \
part of Ruby's standard library. It is flexible, offers heuristic parsing, and \
additionally provides extensive support for IRIs and URI templates."
LICENSE = "Apache-2.0"

PV = "2.8.4"

RPM_NAME = "ruby3.2-rubygem-addressable-2.8.4-1.1.aarch64.rpm"
RPM_HASH = "e45ee263c71f304f7051064f4c5d09dd0045ec530568fcd09d0677d67c11e252150836dfbdeffcf0fff04a7a7ba5c09391887499e8781418e4125cd879cba735"

RPROVIDES:${PN} += "ruby3.2-rubygem-addressable \
rubygem-addressable \
rubygem-ruby-3.2.0-addressable \
rubygem-ruby-3.2.0-addressable-2 \
rubygem-ruby-3.2.0-addressable-2.8 \
rubygem-ruby-3.2.0-addressable-2.8.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-public-suffix"

inherit rpm
