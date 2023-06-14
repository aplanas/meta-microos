SUMMARY = "RSpec runner and formatters"
DESCRIPTION = "BDD for Ruby. RSpec runner and example groups."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "ruby3.2-rubygem-rspec-core-3.12.0-1.4.aarch64.rpm"
RPM_HASH = "417546fbfef83a09585e837054a91c5960bfa8bc9ad4f12331c88e8d0ac6cf2daececb2c0ad8f4b58742265b28c9ac12f8904692b2066563ad58530c9d209f2f"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-core \
rubygem-rspec-core \
rubygem-ruby-3.2.0-rspec-core \
rubygem-ruby-3.2.0-rspec-core-3 \
rubygem-ruby-3.2.0-rspec-core-3.12 \
rubygem-ruby-3.2.0-rspec-core-3.12.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-rspec-support-3.12 \
update-alternatives"

inherit rpm
