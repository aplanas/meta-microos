SUMMARY = "Predicate logic with rule composition"
DESCRIPTION = "Predicate logic with rule composition."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "ruby3.2-rubygem-dry-logic-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "df7c03c8e8942300cabf94c051e13e7b0a0e3288ea375bdfd05eef7355b533279f00c599e1a167ac3538191f2f369879783e45ba97dd55297fb9806e9e1dc925"

RPROVIDES:${PN} += "ruby3.2-rubygem-dry-logic \
ruby3.2-rubygem-dry-logic(aarch-64) \
rubygem(dry-logic) \
rubygem(ruby:3.2.0:dry-logic) \
rubygem(ruby:3.2.0:dry-logic:1) \
rubygem(ruby:3.2.0:dry-logic:1.5) \
rubygem(ruby:3.2.0:dry-logic:1.5.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:concurrent-ruby:1) \
rubygem(ruby:3.2.0:dry-core) \
rubygem(ruby:3.2.0:dry-core:1) \
rubygem(ruby:3.2.0:zeitwerk:2)"

inherit rpm
