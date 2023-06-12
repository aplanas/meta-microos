SUMMARY = "A mixin to add configuration functionality to your classes"
DESCRIPTION = "A mixin to add configuration functionality to your classes."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "ruby3.2-rubygem-dry-configurable-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "a717cda25765c699b224d3aabe653fe2d74871fc0efda7df1ba91e9d5d579e61c8d6e54cfead01261902bca78bf5f9d2e43bc40e5eaa9bb2b03f0ef45e25d344"

RPROVIDES:${PN} += "ruby3.2-rubygem-dry-configurable \
ruby3.2-rubygem-dry-configurable(aarch-64) \
rubygem(dry-configurable) \
rubygem(ruby:3.2.0:dry-configurable) \
rubygem(ruby:3.2.0:dry-configurable:1) \
rubygem(ruby:3.2.0:dry-configurable:1.0) \
rubygem(ruby:3.2.0:dry-configurable:1.0.1)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:dry-core) \
rubygem(ruby:3.2.0:dry-core:1) \
rubygem(ruby:3.2.0:zeitwerk:2)"

inherit rpm
