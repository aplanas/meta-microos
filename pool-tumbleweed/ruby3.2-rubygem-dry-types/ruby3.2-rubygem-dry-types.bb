SUMMARY = "Type system for Ruby supporting coercions, constraints and complex"
DESCRIPTION = "Type system for Ruby supporting coercions, constraints and complex types like \
structs, value objects, enums etc."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "ruby3.2-rubygem-dry-types-1.7.0-1.3.aarch64.rpm"
RPM_HASH = "a84d2437ff18d0288edbc54b8c7f9b5232c9989a5c59f1c4695f46e2bebf05ebf4c60cedb28b55bb7fff4df9f19e8d27c25840efa6e1204aad8ab8e1d02aa066"

RPROVIDES:${PN} += "ruby3.2-rubygem-dry-types \
ruby3.2-rubygem-dry-types(aarch-64) \
rubygem(dry-types) \
rubygem(ruby:3.2.0:dry-types) \
rubygem(ruby:3.2.0:dry-types:1) \
rubygem(ruby:3.2.0:dry-types:1.7) \
rubygem(ruby:3.2.0:dry-types:1.7.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:concurrent-ruby:1) \
rubygem(ruby:3.2.0:dry-core) \
rubygem(ruby:3.2.0:dry-core:1) \
rubygem(ruby:3.2.0:dry-inflector) \
rubygem(ruby:3.2.0:dry-inflector:1) \
rubygem(ruby:3.2.0:dry-logic) \
rubygem(ruby:3.2.0:zeitwerk:2)"

inherit rpm
