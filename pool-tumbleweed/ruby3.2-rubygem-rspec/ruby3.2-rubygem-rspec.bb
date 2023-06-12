SUMMARY = "Meta-gem that depends on the other components"
DESCRIPTION = "BDD for Ruby."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "ruby3.2-rubygem-rspec-3.12.0-1.3.aarch64.rpm"
RPM_HASH = "e070e7686a8075c3aaf88c0f7fa196e51d6a78d0637c83be3253360bc8b3275929440e32b6b2ee32b978a936e00015861bd6b04d51c87a6f59f98b04899c32d6"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec \
ruby3.2-rubygem-rspec(aarch-64) \
rubygem(rspec) \
rubygem(ruby:3.2.0:rspec) \
rubygem(ruby:3.2.0:rspec:3) \
rubygem(ruby:3.2.0:rspec:3.12) \
rubygem(ruby:3.2.0:rspec:3.12.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:rspec-core:3.12) \
rubygem(ruby:3.2.0:rspec-expectations:3.12) \
rubygem(ruby:3.2.0:rspec-mocks:3.12)"

inherit rpm
