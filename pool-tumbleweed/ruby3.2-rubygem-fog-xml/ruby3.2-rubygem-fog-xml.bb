SUMMARY = "XML parsing for fog providers"
DESCRIPTION = "Extraction of the XML parsing tools shared between a \
number of providers in the 'fog' gem."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ruby3.2-rubygem-fog-xml-0.1.4-1.9.aarch64.rpm"
RPM_HASH = "a2a33e98a4171d9162bd6c8782db864fe4e331e879df2372012ada9fa87e06ba4c55a83bca5548d06ddd44a099ac20144320db1ebb5a65a9ce979005885e3d36"

RPROVIDES:${PN} += "ruby3.2-rubygem-fog-xml \
rubygem-fog-xml \
rubygem-ruby-3.2.0-fog-xml \
rubygem-ruby-3.2.0-fog-xml-0 \
rubygem-ruby-3.2.0-fog-xml-0.1 \
rubygem-ruby-3.2.0-fog-xml-0.1.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-fog-core \
rubygem-ruby-3.2.0-nokogiri"

inherit rpm
