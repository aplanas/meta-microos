SUMMARY = "Tools for creating, working with, and running Rails applications"
DESCRIPTION = "Rails internals: application bootup, plugins, generators, and rake tasks."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-railties-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "f3600a3f560281193b6b83ee93e70f9fb4c2b5989763863efe3f424da7d0ef355557d5d96b441abb44633a540374aed190612f989cc0bb919f8204642bc28aa5"

RPROVIDES:${PN} += "ruby3.2-rubygem-railties-7.0 \
rubygem-railties \
rubygem-ruby-3.2.0-railties \
rubygem-ruby-3.2.0-railties-7 \
rubygem-ruby-3.2.0-railties-7.0 \
rubygem-ruby-3.2.0-railties-7.0.5"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-method-source \
rubygem-ruby-3.2.0-rake \
rubygem-ruby-3.2.0-thor-1 \
rubygem-ruby-3.2.0-zeitwerk-2 \
update-alternatives"

inherit rpm
