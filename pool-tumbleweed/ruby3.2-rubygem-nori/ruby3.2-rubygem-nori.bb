SUMMARY = "XML to Hash translator"
DESCRIPTION = "XML to Hash translator."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "ruby3.2-rubygem-nori-2.6.0-1.26.aarch64.rpm"
RPM_HASH = "d91b3aaf8331c37a8d314f63f233c2dfbfb4dbf3e1d066950417be6ca58c9c3a79b7fa55f1b5bfe60d5611d37cf9b35e5933d6b60bfe8ea323d063652d58a734"

RPROVIDES:${PN} += "ruby3.2-rubygem-nori \
ruby3.2-rubygem-nori(aarch-64) \
rubygem(nori) \
rubygem(ruby:3.2.0:nori) \
rubygem(ruby:3.2.0:nori:2) \
rubygem(ruby:3.2.0:nori:2.6) \
rubygem(ruby:3.2.0:nori:2.6.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
