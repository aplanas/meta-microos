SUMMARY = "A modest JavaScript framework for the HTML you already have"
DESCRIPTION = "A modest JavaScript framework for the HTML you already have."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ruby3.2-rubygem-stimulus-rails-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "4b4bd5a829afbc758a0cd608ff57eb0df35cd64b1f2614b093967241ab45b87184b52b8af17e028fda28189c422ee0aa2bdcf35e5bc93d7609255bfe4ac90729"

RPROVIDES:${PN} += "ruby3.2-rubygem-stimulus-rails \
ruby3.2-rubygem-stimulus-rails(aarch-64) \
rubygem(ruby:3.2.0:stimulus-rails) \
rubygem(ruby:3.2.0:stimulus-rails:1) \
rubygem(ruby:3.2.0:stimulus-rails:1.2) \
rubygem(ruby:3.2.0:stimulus-rails:1.2.1) \
rubygem(stimulus-rails)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:railties)"

inherit rpm
