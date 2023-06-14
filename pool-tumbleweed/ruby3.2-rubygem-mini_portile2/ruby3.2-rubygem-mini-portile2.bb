SUMMARY = "Simplistic port-like solution for developers"
DESCRIPTION = "Simplistic port-like solution for developers. It provides a standard and \
simplified way to compile against dependency libraries without messing up your \
system."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "ruby3.2-rubygem-mini_portile2-2.8.0-1.9.aarch64.rpm"
RPM_HASH = "5b51cf965a0ea2b08b8d3ea58e57f94b4dfe255485dee051361b847d2a7247c34a8cf8ceb2affc2f6c053dcf3fd3242db96afc400741cd4dfdbd0d8865200229"

RPROVIDES:${PN} += "ruby3.2-rubygem-mini-portile2 \
rubygem-mini-portile2 \
rubygem-ruby-3.2.0-mini-portile2 \
rubygem-ruby-3.2.0-mini-portile2-2 \
rubygem-ruby-3.2.0-mini-portile2-2.8 \
rubygem-ruby-3.2.0-mini-portile2-2.8.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
