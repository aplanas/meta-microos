SUMMARY = "A simple mixin for CLI interfaces, including option parsing"
DESCRIPTION = "A simple mixin for CLI interfaces, including option parsing."
LICENSE = "Apache-2.0"

PV = "2.1.8"

RPM_NAME = "ruby3.2-rubygem-mixlib-cli-2.1.8-1.14.aarch64.rpm"
RPM_HASH = "c220aef43db323e83192d73c2fbb8669bff6eac47b497847f5d5b5235f1bcb963a171cd11ddbd9d35a8b6b7d4d4a9ddd4522bcf8bb0775c33b1958901c9719ea"

RPROVIDES:${PN} += "ruby3.2-rubygem-mixlib-cli \
rubygem-mixlib-cli \
rubygem-ruby-3.2.0-mixlib-cli \
rubygem-ruby-3.2.0-mixlib-cli-2 \
rubygem-ruby-3.2.0-mixlib-cli-2.1 \
rubygem-ruby-3.2.0-mixlib-cli-2.1.8"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
