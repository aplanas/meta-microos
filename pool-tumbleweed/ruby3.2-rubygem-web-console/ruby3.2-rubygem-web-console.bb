SUMMARY = "A debugging tool for your Ruby on Rails applications"
DESCRIPTION = "A debugging tool for your Ruby on Rails applications."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "ruby3.2-rubygem-web-console-4.2.0-1.10.aarch64.rpm"
RPM_HASH = "894c5979520cb1a0d6fea9b469ff0f521500566ec23ce64dec438cbc747cbc8d77a412abf26eaa985bfc866bd0683a1a659c10b0123c7f8b2654f8a3d60148ea"

RPROVIDES:${PN} += "ruby3.2-rubygem-web-console \
rubygem-ruby-3.2.0-web-console \
rubygem-ruby-3.2.0-web-console-4 \
rubygem-ruby-3.2.0-web-console-4.2 \
rubygem-ruby-3.2.0-web-console-4.2.0 \
rubygem-web-console"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actionview \
rubygem-ruby-3.2.0-activemodel \
rubygem-ruby-3.2.0-bindex \
rubygem-ruby-3.2.0-railties"

inherit rpm
