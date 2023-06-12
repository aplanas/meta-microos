SUMMARY = "Powerful, flexible and configurable coercion library"
DESCRIPTION = "Powerful, flexible and configurable coercion library. And nothing more."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby3.2-rubygem-coercible-1.0.0-1.31.aarch64.rpm"
RPM_HASH = "2b0803f67af85dc3475a8720ef1d6b03eb53597a6cb3e07f246615574c288ff31018138d57513534ded7263a37d68a21992496996d3f9f611312721ae4d7d344"

RPROVIDES:${PN} += "ruby3.2-rubygem-coercible \
ruby3.2-rubygem-coercible(aarch-64) \
rubygem(coercible) \
rubygem(ruby:3.2.0:coercible) \
rubygem(ruby:3.2.0:coercible:1) \
rubygem(ruby:3.2.0:coercible:1.0) \
rubygem(ruby:3.2.0:coercible:1.0.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:descendants_tracker:0.0)"

inherit rpm
