SUMMARY = "A simple REST client for the Docker Remote API"
DESCRIPTION = "A simple REST client for the Docker Remote API."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "ruby3.2-rubygem-docker-api-2.2.0-1.5.aarch64.rpm"
RPM_HASH = "3b6a4abf299a0af1aaa27cec244331f66d6798cd428d1976abb91c25118f555afbfbc3698bb15754fc63e26ba6208064594f68b0da7e188f1afdb04d5493247a"

RPROVIDES:${PN} += "ruby3.2-rubygem-docker-api \
ruby3.2-rubygem-docker-api(aarch-64) \
rubygem(docker-api) \
rubygem(ruby:3.2.0:docker-api) \
rubygem(ruby:3.2.0:docker-api:2) \
rubygem(ruby:3.2.0:docker-api:2.2) \
rubygem(ruby:3.2.0:docker-api:2.2.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:excon) \
rubygem(ruby:3.2.0:multi_json)"

inherit rpm
