SUMMARY = "RSpec for Rails"
DESCRIPTION = "rspec-rails is a testing framework for Rails 5+."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "ruby3.2-rubygem-rspec-rails-4.0-4.0.2-1.12.aarch64.rpm"
RPM_HASH = "d20849ae761778c7aaf22c00cf3c744c0b8661371ba4d02793cffd2e6ca7e51ddb1508f2f1f6d931bbc0ea6d68e1bf764674448ca0335544c5f714f38d404986"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-rails-4.0 \
ruby3.2-rubygem-rspec-rails-4.0(aarch-64) \
rubygem(rspec-rails) \
rubygem(ruby:3.2.0:rspec-rails) \
rubygem(ruby:3.2.0:rspec-rails:4) \
rubygem(ruby:3.2.0:rspec-rails:4.0) \
rubygem(ruby:3.2.0:rspec-rails:4.0.2)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:railties) \
rubygem(ruby:3.2.0:rspec-core:3) \
rubygem(ruby:3.2.0:rspec-expectations:3) \
rubygem(ruby:3.2.0:rspec-mocks:3) \
rubygem(ruby:3.2.0:rspec-support:3)"

inherit rpm
