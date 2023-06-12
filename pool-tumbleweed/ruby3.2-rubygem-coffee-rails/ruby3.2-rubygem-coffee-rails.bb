SUMMARY = "CoffeeScript adapter for the Rails asset pipeline"
DESCRIPTION = "CoffeeScript adapter for the Rails asset pipeline."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "ruby3.2-rubygem-coffee-rails-5.0.0-2.23.aarch64.rpm"
RPM_HASH = "0503f9828c9ac6d0d1d7d60366f07baf5111cedf2d2e16547d8e6da5f96a02df3f0c10c3bc78c7c1396178eb594dbc99276b586de65e5e4ed5229275482a4cdb"

RPROVIDES:${PN} += "ruby3.2-rubygem-coffee-rails \
ruby3.2-rubygem-coffee-rails(aarch-64) \
rubygem(coffee-rails) \
rubygem(ruby:3.2.0:coffee-rails) \
rubygem(ruby:3.2.0:coffee-rails:5) \
rubygem(ruby:3.2.0:coffee-rails:5.0) \
rubygem(ruby:3.2.0:coffee-rails:5.0.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:coffee-script) \
rubygem(ruby:3.2.0:railties)"

inherit rpm
