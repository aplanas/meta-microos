SUMMARY = "A toolset of small support modules used throughout the dry-rb"
DESCRIPTION = "A toolset of small support modules used throughout the dry-rb ecosystem."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby3.2-rubygem-dry-core-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "c24be4fc00d5f04bb9b318004ccd9bf75235b44a38e4359778b3bf5d40fcaf676494ed099bdac7d1caf61f98b1f8c7d0614414f5e8cca012eed1b05278bd0efc"

RPROVIDES:${PN} += "ruby3.2-rubygem-dry-core \
rubygem-dry-core \
rubygem-ruby-3.2.0-dry-core \
rubygem-ruby-3.2.0-dry-core-1 \
rubygem-ruby-3.2.0-dry-core-1.0 \
rubygem-ruby-3.2.0-dry-core-1.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-concurrent-ruby-1 \
rubygem-ruby-3.2.0-zeitwerk-2"

inherit rpm
