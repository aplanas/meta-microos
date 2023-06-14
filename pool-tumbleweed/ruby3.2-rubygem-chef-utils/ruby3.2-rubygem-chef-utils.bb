SUMMARY = "Basic utility functions for Core Chef Infra development"
DESCRIPTION = "Basic utility functions for Core Chef Infra development."
LICENSE = "Apache-2.0"

PV = "18.0.185"

RPM_NAME = "ruby3.2-rubygem-chef-utils-18.0.185-1.3.aarch64.rpm"
RPM_HASH = "1f93a427be3f88a8b3e19cff1a9555dcf31e945a1e32732358ee0a6786dd4658ca2c7ed2b6707cbbbc1c84a6930d04ae6f6ead9920933e0a03dfc4a4831fdfef"

RPROVIDES:${PN} += "ruby3.2-rubygem-chef-utils \
rubygem-chef-utils \
rubygem-ruby-3.2.0-chef-utils \
rubygem-ruby-3.2.0-chef-utils-18 \
rubygem-ruby-3.2.0-chef-utils-18.0 \
rubygem-ruby-3.2.0-chef-utils-18.0.185"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-concurrent-ruby"

inherit rpm
