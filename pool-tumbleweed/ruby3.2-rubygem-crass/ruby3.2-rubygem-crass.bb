SUMMARY = "CSS parser based on the CSS Syntax Level 3 spec"
DESCRIPTION = "Crass is a pure Ruby CSS parser based on the CSS Syntax Level 3 spec."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "ruby3.2-rubygem-crass-1.0.6-1.17.aarch64.rpm"
RPM_HASH = "894681bcd104923a7e13f9f07bfa4f928a0048741f3b3882fc39931379aa3519966e38d72c84c44f87b2115b0279fa4adaf29a76aba66150264fe48e986cc110"

RPROVIDES:${PN} += "ruby3.2-rubygem-crass \
rubygem-crass \
rubygem-ruby-3.2.0-crass \
rubygem-ruby-3.2.0-crass-1 \
rubygem-ruby-3.2.0-crass-1.0 \
rubygem-ruby-3.2.0-crass-1.0.6"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
