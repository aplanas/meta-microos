SUMMARY = "JSON Web Token and its family (JSON Web Signature, JSON Web"
DESCRIPTION = "JSON Web Token and its family (JSON Web Signature, JSON Web Encryption and \
JSON Web Key) in Ruby."
LICENSE = "MIT"

PV = "1.16.1"

RPM_NAME = "ruby3.2-rubygem-json-jwt-1.16.1-1.5.aarch64.rpm"
RPM_HASH = "5d45a87eb87239acca031212c0827b8459c9f9ffbe56c9e1e514a07d2b353f47d0ac83b142634eca78986693af9fd1381534e29e1b20877e3443aaa6a634abe6"

RPROVIDES:${PN} += "ruby3.2-rubygem-json-jwt \
ruby3.2-rubygem-json-jwt(aarch-64) \
rubygem(json-jwt) \
rubygem(ruby:3.2.0:json-jwt) \
rubygem(ruby:3.2.0:json-jwt:1) \
rubygem(ruby:3.2.0:json-jwt:1.16) \
rubygem(ruby:3.2.0:json-jwt:1.16.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:aes_key_wrap) \
rubygem(ruby:3.2.0:bindata) \
rubygem(ruby:3.2.0:faraday-follow_redirects) \
rubygem(ruby:3.2.0:faraday:2)"

inherit rpm
