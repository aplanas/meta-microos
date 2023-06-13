SUMMARY = "A module that provides a two-phase lock with a counter"
DESCRIPTION = "A module that provides a two-phase lock with a counter."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "ruby3.2-rubygem-sync-0.5.0-1.11.aarch64.rpm"
RPM_HASH = "72eb5b7cdaec628ff0163eac6dea95a97d72fae3b2dc438e594fc04f7b6b1f96554344d931970b7454d841e868018bf90d7f48c3ab5e0b111f767096db8277dd"

RPROVIDES:${PN} += "ruby3.2-rubygem-sync \
ruby3.2-rubygem-sync(aarch-64) \
rubygem(ruby:3.2.0:sync) \
rubygem(ruby:3.2.0:sync:0) \
rubygem(ruby:3.2.0:sync:0.5) \
rubygem(ruby:3.2.0:sync:0.5.0) \
rubygem(sync)"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
