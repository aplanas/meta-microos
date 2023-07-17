SUMMARY = "Meta package for dependencies to build TruffleRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build TruffleRuby."
LICENSE = "MIT"

PV = "20230710"

RPM_NAME = "ruby-build-dependencies-truffleruby-20230710-1.1.noarch.rpm"
RPM_HASH = "f66df5dd65d1be6510ff1e990ab6539d6cb63a379c6c0a39cd5f5047c3ae3bdc585be74edc3f273a5db3f7e0cb654b8ed5840bf7cffacbbd14c9beb7145572ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-truffleruby"

RDEPENDS:${PN} += "gcc \
openssl-devel"

inherit rpm
