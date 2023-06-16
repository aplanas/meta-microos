SUMMARY = "Generic interface to multiple Ruby template engines"
DESCRIPTION = "Generic interface to multiple Ruby template engines."
LICENSE = "MIT"

PV = "2.0.11"

RPM_NAME = "ruby3.2-rubygem-tilt-2.0.11-1.6.aarch64.rpm"
RPM_HASH = "b51463250cf59201beb898b86e17627c1a025f417ba14c472033cdff84a5bc621b08cf3c9977ebab1f81a1e7802ddbb6bcfaf5e42dd1809d2018f908eb3e8b46"

RPROVIDES:${PN} += "ruby3.2-rubygem-tilt \
rubygem-ruby-3.2.0-tilt \
rubygem-ruby-3.2.0-tilt-2 \
rubygem-ruby-3.2.0-tilt-2.0 \
rubygem-ruby-3.2.0-tilt-2.0.11 \
rubygem-tilt"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
update-alternatives"

inherit rpm
