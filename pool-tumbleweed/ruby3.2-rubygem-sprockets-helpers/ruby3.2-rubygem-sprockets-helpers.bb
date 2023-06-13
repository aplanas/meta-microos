SUMMARY = "Asset path helpers for Sprockets 2.x & 3.x applications"
DESCRIPTION = "Asset path helpers for Sprockets 2.x & 3.x applications."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby3.2-rubygem-sprockets-helpers-1.4.0-1.15.aarch64.rpm"
RPM_HASH = "14e34efdaecf588dc8fcdb160f546a17c33dd5a2b949ce8de3d1a4339a07bc89baf2b9f228d1dbe9775c2a5e3b6ce0f5f682f6d95c12c2e47d6fcbd91ef3e459"

RPROVIDES:${PN} += "ruby3.2-rubygem-sprockets-helpers \
ruby3.2-rubygem-sprockets-helpers(aarch-64) \
rubygem(ruby:3.2.0:sprockets-helpers) \
rubygem(ruby:3.2.0:sprockets-helpers:1) \
rubygem(ruby:3.2.0:sprockets-helpers:1.4) \
rubygem(ruby:3.2.0:sprockets-helpers:1.4.0) \
rubygem(sprockets-helpers)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:sprockets)"

inherit rpm
