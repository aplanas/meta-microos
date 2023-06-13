SUMMARY = "Your swiss army knife for executing external commands in Ruby safely"
DESCRIPTION = "Your swiss army knife for executing external commands in Ruby safely and \
conveniently."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby3.2-rubygem-cheetah-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "5086d2e9cce4707cfa96e3b2296df52e9fce38a0b647f73ec05bddfe5551b7ce60b4af4feffb51018a721473f960595e29e8f59fe6567fe6f294e58deb6dc128"

RPROVIDES:${PN} += "ruby3.2-rubygem-cheetah \
ruby3.2-rubygem-cheetah(aarch-64) \
rubygem(cheetah) \
rubygem(ruby:3.2.0:cheetah) \
rubygem(ruby:3.2.0:cheetah:1) \
rubygem(ruby:3.2.0:cheetah:1.0) \
rubygem(ruby:3.2.0:cheetah:1.0.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:abstract_method:1)"

inherit rpm
