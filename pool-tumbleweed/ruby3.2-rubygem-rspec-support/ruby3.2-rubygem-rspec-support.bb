SUMMARY = "Common code needed by the other RSpec gems"
DESCRIPTION = "Support utilities for RSpec gems."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "ruby3.2-rubygem-rspec-support-3.12.0-1.3.aarch64.rpm"
RPM_HASH = "e35f7a4bd4222c40a5cc0e10ad2a9dd09ec76a87e33ea80f1fc70092ed43ecad2a5e5b1d35f6cbab9f47871f0dbb795dcecf8f6b8ced9d0f938cbf03fcac5814"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-support \
rubygem-rspec-support \
rubygem-ruby-3.2.0-rspec-support \
rubygem-ruby-3.2.0-rspec-support-3 \
rubygem-ruby-3.2.0-rspec-support-3.12 \
rubygem-ruby-3.2.0-rspec-support-3.12.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
