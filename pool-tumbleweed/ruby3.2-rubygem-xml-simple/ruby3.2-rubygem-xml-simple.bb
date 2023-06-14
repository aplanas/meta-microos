SUMMARY = "A simple API for XML processing"
DESCRIPTION = "A simple API for XML processing."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "ruby3.2-rubygem-xml-simple-1.1.9-1.9.aarch64.rpm"
RPM_HASH = "16c7a1f5620ce24cd1fce192f24bc0974aeab4df6f6a4430bdcfd7f804777f02ab3ae68859f3439a76d0bee22d4b4bcbdc81e923cadf65848b30a444136c3627"

RPROVIDES:${PN} += "ruby3.2-rubygem-xml-simple \
rubygem-ruby-3.2.0-xml-simple \
rubygem-ruby-3.2.0-xml-simple-1 \
rubygem-ruby-3.2.0-xml-simple-1.1 \
rubygem-ruby-3.2.0-xml-simple-1.1.9 \
rubygem-xml-simple"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-rexml"

inherit rpm
