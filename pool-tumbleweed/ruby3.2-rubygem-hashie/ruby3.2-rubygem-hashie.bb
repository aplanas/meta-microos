SUMMARY = "Your friendly neighborhood hash library"
DESCRIPTION = "Hashie is a collection of classes and mixins that make hashes more powerful."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "ruby3.2-rubygem-hashie-5.0.0-1.9.aarch64.rpm"
RPM_HASH = "5353f02a8bd9629c3e415c22eb5be443349f34a57555fe065eb74a971fb9e9097907b6957bf85fc7aeed1302770a64aa8620732a35912c38d5bd6ab467fc315e"

RPROVIDES:${PN} += "ruby3.2-rubygem-hashie \
rubygem-hashie \
rubygem-ruby-3.2.0-hashie \
rubygem-ruby-3.2.0-hashie-5 \
rubygem-ruby-3.2.0-hashie-5.0 \
rubygem-ruby-3.2.0-hashie-5.0.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
