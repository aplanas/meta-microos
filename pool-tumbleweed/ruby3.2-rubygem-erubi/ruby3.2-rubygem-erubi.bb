SUMMARY = "Small ERB Implementation"
DESCRIPTION = "Erubi is a ERB template engine for ruby. It is a simplified fork of Erubis."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "ruby3.2-rubygem-erubi-1.11.0-1.6.aarch64.rpm"
RPM_HASH = "3aac8ab349fa234c76c475a6fc52910b522e88894eff109db206ef9da9d68f9ebc746d0175fc18eb03aa7837c695b36d51dc7208148cb3da4802e6a2c4ec7880"

RPROVIDES:${PN} += "ruby3.2-rubygem-erubi \
ruby3.2-rubygem-erubi(aarch-64) \
rubygem(erubi) \
rubygem(ruby:3.2.0:erubi) \
rubygem(ruby:3.2.0:erubi:1) \
rubygem(ruby:3.2.0:erubi:1.11) \
rubygem(ruby:3.2.0:erubi:1.11.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
