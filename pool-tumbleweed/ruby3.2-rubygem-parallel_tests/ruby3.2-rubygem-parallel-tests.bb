SUMMARY = "Run Test::Unit / RSpec / Cucumber / Spinach in parallel"
DESCRIPTION = "Run Test::Unit / RSpec / Cucumber / Spinach in parallel."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby3.2-rubygem-parallel_tests-4.0.0-1.4.aarch64.rpm"
RPM_HASH = "8410736f6ee002f4b35d632aed4d14978e18804b7958b0a3dcfb7f504c5989981dbc7e916d4fe84cefadec213b438c3ee4f5d52d180a8812442faf72ce89297f"

RPROVIDES:${PN} += "ruby3.2-rubygem-parallel-tests \
rubygem-parallel-tests \
rubygem-ruby-3.2.0-parallel-tests \
rubygem-ruby-3.2.0-parallel-tests-4 \
rubygem-ruby-3.2.0-parallel-tests-4.0 \
rubygem-ruby-3.2.0-parallel-tests-4.0.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
rubygem-ruby-3.2.0-parallel \
update-alternatives"

inherit rpm
