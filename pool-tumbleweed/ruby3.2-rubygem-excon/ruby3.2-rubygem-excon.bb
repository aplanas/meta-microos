SUMMARY = "speed, persistence, http(s)"
DESCRIPTION = "EXtended http(s) CONnections."
LICENSE = "MIT"

PV = "0.99.0"

RPM_NAME = "ruby3.2-rubygem-excon-0.99.0-1.2.aarch64.rpm"
RPM_HASH = "1aacc709af2c834d566698caedc633a92fb23a221ab42b92954503a0a56f80e600ac2cb38d0391b4fb531658df26638440bd9a65909e133ca4ad49cc0feddd48"

RPROVIDES:${PN} += "ruby3.2-rubygem-excon \
rubygem-excon \
rubygem-ruby-3.2.0-excon \
rubygem-ruby-3.2.0-excon-0 \
rubygem-ruby-3.2.0-excon-0.99 \
rubygem-ruby-3.2.0-excon-0.99.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
