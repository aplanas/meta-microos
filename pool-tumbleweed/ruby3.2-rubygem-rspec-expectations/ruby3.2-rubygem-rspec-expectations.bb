SUMMARY = "API to express expected outcomes of a code example"
DESCRIPTION = "rspec-expectations provides a simple, readable API to express expected \
outcomes of a code example."
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "ruby3.2-rubygem-rspec-expectations-3.12.0-1.3.aarch64.rpm"
RPM_HASH = "794faaa5907345cfb887966f1f7f9eace188616425a3c84f795d818d234ebe9e9578c67ea94300481f8a17d8b49c2408b12ee1c52e4e9452b97ca7867100f676"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-expectations \
ruby3.2-rubygem-rspec-expectations(aarch-64) \
rubygem(rspec-expectations) \
rubygem(ruby:3.2.0:rspec-expectations) \
rubygem(ruby:3.2.0:rspec-expectations:3) \
rubygem(ruby:3.2.0:rspec-expectations:3.12) \
rubygem(ruby:3.2.0:rspec-expectations:3.12.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:diff-lcs) \
rubygem(ruby:3.2.0:rspec-support:3.12)"

inherit rpm
