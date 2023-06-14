SUMMARY = "Ruby CoffeeScript Compiler"
DESCRIPTION = "Ruby CoffeeScript is a bridge to the JS CoffeeScript compiler."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "ruby3.2-rubygem-coffee-script-2.4.1-1.36.aarch64.rpm"
RPM_HASH = "3677a4ff92d4fa0a353d639b9c60b8eee2e652c7a9b1f08079daca944a550db592244a62897305e9cb8c2073a5fe976b2daba64ca1546531d33a39fc8a094c8f"

RPROVIDES:${PN} += "ruby3.2-rubygem-coffee-script \
rubygem-coffee-script \
rubygem-ruby-3.2.0-coffee-script \
rubygem-ruby-3.2.0-coffee-script-2 \
rubygem-ruby-3.2.0-coffee-script-2.4 \
rubygem-ruby-3.2.0-coffee-script-2.4.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-coffee-script-source \
rubygem-ruby-3.2.0-execjs"

inherit rpm
