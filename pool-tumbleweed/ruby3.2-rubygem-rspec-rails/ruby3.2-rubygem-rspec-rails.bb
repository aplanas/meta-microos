SUMMARY = "RSpec for Rails"
DESCRIPTION = "rspec-rails is a testing framework for Rails 5+."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "ruby3.2-rubygem-rspec-rails-6.0.1-1.5.aarch64.rpm"
RPM_HASH = "6e920f3491557cdb823da793d36229cb1fa77235d4b53323e3a650f6f1c47f9df967375e5546a58ab7bbe24e8e98ad24528da3409ee188cfe89246ba3406c726"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-rails \
ruby3.2-rubygem-rspec-rails(aarch-64) \
rubygem(rspec-rails) \
rubygem(ruby:3.2.0:rspec-rails) \
rubygem(ruby:3.2.0:rspec-rails:6) \
rubygem(ruby:3.2.0:rspec-rails:6.0) \
rubygem(ruby:3.2.0:rspec-rails:6.0.1)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:railties) \
rubygem(ruby:3.2.0:rspec-core:3) \
rubygem(ruby:3.2.0:rspec-expectations:3) \
rubygem(ruby:3.2.0:rspec-mocks:3) \
rubygem(ruby:3.2.0:rspec-support:3)"

inherit rpm
