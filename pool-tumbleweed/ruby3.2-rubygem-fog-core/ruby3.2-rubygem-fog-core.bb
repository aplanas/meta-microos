SUMMARY = "Shared classes and tests for fog providers and services"
DESCRIPTION = "Shared classes and tests for fog providers and services."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby3.2-rubygem-fog-core-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "822945c08b5c1e702db785c07d5fafcd6d5fa65386971c5709a5f690034ec9e2d36227f5e2076868f2697785a1c04b1f0e04018fd73f98ccf501bf2f38982d0e"

RPROVIDES:${PN} += "ruby3.2-rubygem-fog-core \
ruby3.2-rubygem-fog-core(aarch-64) \
rubygem(fog-core) \
rubygem(ruby:3.2.0:fog-core) \
rubygem(ruby:3.2.0:fog-core:2) \
rubygem(ruby:3.2.0:fog-core:2.3) \
rubygem(ruby:3.2.0:fog-core:2.3.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:builder) \
rubygem(ruby:3.2.0:excon:0) \
rubygem(ruby:3.2.0:formatador) \
rubygem(ruby:3.2.0:mime-types)"

inherit rpm
