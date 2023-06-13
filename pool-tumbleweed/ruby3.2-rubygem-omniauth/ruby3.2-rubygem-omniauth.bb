SUMMARY = "A generalized Rack framework for multiple-provider authentication"
DESCRIPTION = "A generalized Rack framework for multiple-provider authentication."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "ruby3.2-rubygem-omniauth-2.1.0-1.8.aarch64.rpm"
RPM_HASH = "3780d9d71c28618b7663b77a1dcda5701b5013139aa6a77de76aa02e8c1bbc518aaf9273caed2754330e0c622b033d3a63c9117ece53d1eac188ef9746567cd7"

RPROVIDES:${PN} += "ruby3.2-rubygem-omniauth \
ruby3.2-rubygem-omniauth(aarch-64) \
rubygem(omniauth) \
rubygem(ruby:3.2.0:omniauth) \
rubygem(ruby:3.2.0:omniauth:2) \
rubygem(ruby:3.2.0:omniauth:2.1) \
rubygem(ruby:3.2.0:omniauth:2.1.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:hashie) \
rubygem(ruby:3.2.0:rack) \
rubygem(ruby:3.2.0:rack-protection)"

inherit rpm
