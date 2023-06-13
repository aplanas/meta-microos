SUMMARY = "A simple Ruby framework for building REST-like APIs"
DESCRIPTION = "A Ruby framework for rapid API development with great conventions."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "ruby3.2-rubygem-grape-1.6.2-1.9.aarch64.rpm"
RPM_HASH = "c778f24174a7ad661e0e0bc74301305686b329ab3f7da1ca179c9e81570e7fcfb04d504ad504f19fbd7861ff3c4b0e67250e3809a9831ea5ee90700f9d442fbe"

RPROVIDES:${PN} += "ruby3.2-rubygem-grape \
ruby3.2-rubygem-grape(aarch-64) \
rubygem(grape) \
rubygem(ruby:3.2.0:grape) \
rubygem(ruby:3.2.0:grape:1) \
rubygem(ruby:3.2.0:grape:1.6) \
rubygem(ruby:3.2.0:grape:1.6.2)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:builder) \
rubygem(ruby:3.2.0:dry-types) \
rubygem(ruby:3.2.0:mustermann-grape:1.0) \
rubygem(ruby:3.2.0:rack) \
rubygem(ruby:3.2.0:rack-accept)"

inherit rpm
