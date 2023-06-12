SUMMARY = "Timezone Data for TZInfo"
DESCRIPTION = "TZInfo::Data contains data from the IANA Time Zone database packaged as Ruby \
modules for use with TZInfo."
LICENSE = "MIT"

PV = "1.2022.7"

RPM_NAME = "ruby3.2-rubygem-tzinfo-data-1.2022.7-1.3.aarch64.rpm"
RPM_HASH = "cb19fd2af3c2205d39fdced066b2a8e0177d00c08f1e1076447849867b9e7793f61aa3b3656e8d30de63eabd36483dec33d922618a6ab01502fb9ce756fed4cf"

RPROVIDES:${PN} += "ruby3.2-rubygem-tzinfo-data \
ruby3.2-rubygem-tzinfo-data(aarch-64) \
rubygem(ruby:3.2.0:tzinfo-data) \
rubygem(ruby:3.2.0:tzinfo-data:1) \
rubygem(ruby:3.2.0:tzinfo-data:1.2022) \
rubygem(ruby:3.2.0:tzinfo-data:1.2022.7) \
rubygem(tzinfo-data)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:tzinfo)"

inherit rpm
