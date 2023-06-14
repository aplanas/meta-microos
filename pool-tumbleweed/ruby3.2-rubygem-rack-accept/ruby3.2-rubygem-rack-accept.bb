SUMMARY = "HTTP Accept* for Ruby/Rack"
DESCRIPTION = "HTTP Accept, Accept-Charset, Accept-Encoding, and Accept-Language for \
Ruby/Rack."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "ruby3.2-rubygem-rack-accept-0.4.5-1.20.aarch64.rpm"
RPM_HASH = "c8b4a7550e452b2423b123432047ea1b0120a411892b3846b49de292d716cbdd710698a019f257026323af896c9431daa326d78fbc84ddbf816b6fd299bf5fe0"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-accept \
rubygem-rack-accept \
rubygem-ruby-3.2.0-rack-accept \
rubygem-ruby-3.2.0-rack-accept-0 \
rubygem-ruby-3.2.0-rack-accept-0.4 \
rubygem-ruby-3.2.0-rack-accept-0.4.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-rack"

inherit rpm
