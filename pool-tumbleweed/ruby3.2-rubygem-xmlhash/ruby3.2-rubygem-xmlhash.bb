SUMMARY = "Xmlhash is a naive form of XML::Simple"
DESCRIPTION = "A small C module that wraps libxml2's xmlreader to parse a XML \
string into a ruby hash."
LICENSE = "MIT"

PV = "1.3.8"

RPM_NAME = "ruby3.2-rubygem-xmlhash-1.3.8-1.12.aarch64.rpm"
RPM_HASH = "98ecfa05daff24f5c3192228d3e20394724f3a55204a9b737e2c7eed6ab245ab0a388fa1be45a8ca373ab3f7e054b449d5ffba5425c583a78f82998f51ab0f28"

RPROVIDES:${PN} += "ruby3.2-rubygem-xmlhash \
rubygem-ruby-3.2.0-xmlhash \
rubygem-ruby-3.2.0-xmlhash-1 \
rubygem-ruby-3.2.0-xmlhash-1.3 \
rubygem-ruby-3.2.0-xmlhash-1.3.8 \
rubygem-xmlhash"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
libxml2.so.2 \
ruby-abi \
rubygem-ruby-3.2.0-pkg-config"

inherit rpm
