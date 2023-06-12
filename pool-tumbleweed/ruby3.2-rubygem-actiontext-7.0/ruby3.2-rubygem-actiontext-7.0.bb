SUMMARY = "Rich text framework"
DESCRIPTION = "Edit and display rich text in Rails applications."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-actiontext-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "3bcf438e4413d2fea2a5b3f66c70cdc0c421884d73c8a3584c78cb77f9d20e522bf68c67d8c10560041dbf4add1c1a32543515c5791485784aab090ff06b203c"

RPROVIDES:${PN} += "ruby3.2-rubygem-actiontext-7.0 \
ruby3.2-rubygem-actiontext-7.0(aarch-64) \
rubygem(actiontext) \
rubygem(ruby:3.2.0:actiontext) \
rubygem(ruby:3.2.0:actiontext:7) \
rubygem(ruby:3.2.0:actiontext:7.0) \
rubygem(ruby:3.2.0:actiontext:7.0.4)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:activerecord) \
rubygem(ruby:3.2.0:activestorage) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:globalid) \
rubygem(ruby:3.2.0:nokogiri)"

inherit rpm
