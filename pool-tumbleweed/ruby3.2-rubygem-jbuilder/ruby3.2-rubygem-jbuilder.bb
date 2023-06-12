SUMMARY = "Create JSON structures via a Builder-style DSL"
DESCRIPTION = "Create JSON structures via a Builder-style DSL."
LICENSE = "MIT"

PV = "2.11.5"

RPM_NAME = "ruby3.2-rubygem-jbuilder-2.11.5-1.10.aarch64.rpm"
RPM_HASH = "e62bb2f5c7e5b6031ef296aa653ca3621fc7c70a4a505b9cbeababa0400da87bfbad6c5b8ba6562ca6b2287d6b7ba91b68c03a98f66cfecfdc1dd07e1c6a2d65"

RPROVIDES:${PN} += "ruby3.2-rubygem-jbuilder \
ruby3.2-rubygem-jbuilder(aarch-64) \
rubygem(jbuilder) \
rubygem(ruby:3.2.0:jbuilder) \
rubygem(ruby:3.2.0:jbuilder:2) \
rubygem(ruby:3.2.0:jbuilder:2.11) \
rubygem(ruby:3.2.0:jbuilder:2.11.5)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionview) \
rubygem(ruby:3.2.0:activesupport)"

inherit rpm
