SUMMARY = "A lightweight mime type lookup toy"
DESCRIPTION = "A lightweight mime type lookup toy."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ruby3.2-rubygem-mini_mime-1.1.2-1.10.aarch64.rpm"
RPM_HASH = "008c3a5427206f707a3e9701321a339d59f122869b8eaba265046e4964ab9acffba564158f55c7dcb3d51d3e31dd59f7f87478e3df4579912e707f2934afdd2c"

RPROVIDES:${PN} += "ruby3.2-rubygem-mini-mime \
rubygem-mini-mime \
rubygem-ruby-3.2.0-mini-mime \
rubygem-ruby-3.2.0-mini-mime-1 \
rubygem-ruby-3.2.0-mini-mime-1.1 \
rubygem-ruby-3.2.0-mini-mime-1.1.2"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby3.2 \
ruby-abi"

inherit rpm
