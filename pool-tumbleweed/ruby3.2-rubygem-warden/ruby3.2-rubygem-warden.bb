SUMMARY = "An authentication library compatible with all Rack-based frameworks"
DESCRIPTION = "An authentication library compatible with all Rack-based frameworks."
LICENSE = "MIT"

PV = "1.2.9"

RPM_NAME = "ruby3.2-rubygem-warden-1.2.9-1.15.aarch64.rpm"
RPM_HASH = "0dbf6d1aafe7777cdf9a81304e433c525a0ece5feb69f463ca5039353655150c6eeb155046a7a83e85a6e2ed4d7292451fc32da0e61db348425d487b34fdf43a"

RPROVIDES:${PN} += "ruby3.2-rubygem-warden \
rubygem-ruby-3.2.0-warden \
rubygem-ruby-3.2.0-warden-1 \
rubygem-ruby-3.2.0-warden-1.2 \
rubygem-ruby-3.2.0-warden-1.2.9 \
rubygem-warden"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-rack"

inherit rpm
