SUMMARY = "Enhance your VERSION! Sugar for Version modules"
DESCRIPTION = "Versions are good. Versions are cool. Versions will win."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ruby3.2-rubygem-version_gem-1.1.1-1.5.aarch64.rpm"
RPM_HASH = "aecb41677d166ae4b8c4643a2eb4b4105984f74e658a5135fee18b26848d9240f110ef57d48fe53d61c24844904ffc93e722fec6f647d077a6e12981c83c62dc"

RPROVIDES:${PN} += "ruby3.2-rubygem-version_gem \
ruby3.2-rubygem-version_gem(aarch-64) \
rubygem(ruby:3.2.0:version_gem) \
rubygem(ruby:3.2.0:version_gem:1) \
rubygem(ruby:3.2.0:version_gem:1.1) \
rubygem(ruby:3.2.0:version_gem:1.1.1) \
rubygem(version_gem)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
