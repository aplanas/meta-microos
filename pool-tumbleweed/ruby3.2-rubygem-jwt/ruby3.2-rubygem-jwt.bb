SUMMARY = "JSON Web Token implementation in Ruby"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) \
standard."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ruby3.2-rubygem-jwt-2.5.0-1.5.aarch64.rpm"
RPM_HASH = "1e0adeeb27f6252a8eefe1e80b98551b88bb0585c84cbfaa1ef00de47c2f558e6e3cf0a4fcd47895dedef14006732c61fe33c8d96ec4bf8083271676d6dc7cc5"

RPROVIDES:${PN} += "ruby3.2-rubygem-jwt \
ruby3.2-rubygem-jwt(aarch-64) \
rubygem(jwt) \
rubygem(ruby:3.2.0:jwt) \
rubygem(ruby:3.2.0:jwt:2) \
rubygem(ruby:3.2.0:jwt:2.5) \
rubygem(ruby:3.2.0:jwt:2.5.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
