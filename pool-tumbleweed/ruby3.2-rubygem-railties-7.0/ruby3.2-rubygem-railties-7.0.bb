SUMMARY = "Tools for creating, working with, and running Rails applications"
DESCRIPTION = "Rails internals: application bootup, plugins, generators, and rake tasks."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-railties-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "df6f9ee71ba4f97faf68f96a4fd66e422cce55a3d4e514fdae2838881b852180408d2cb24d0d36bc2a403e6abcdaeebf3db97d4dcacb749aecdf45b31b94f311"

RPROVIDES:${PN} += "ruby3.2-rubygem-railties-7.0 \
rubygem-railties \
rubygem-ruby-3.2.0-railties \
rubygem-ruby-3.2.0-railties-7 \
rubygem-ruby-3.2.0-railties-7.0 \
rubygem-ruby-3.2.0-railties-7.0.4"

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
