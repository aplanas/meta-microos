SUMMARY = "Ruby extension for base32 encoding and decoding"
DESCRIPTION = "Ruby extension for base32 encoding and decoding."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "ruby3.2-rubygem-base32-0.3.4-1.15.aarch64.rpm"
RPM_HASH = "1750894528dbd7cb353b6b4dd86b8a3ac9c18aa4a8744381d2ee181df780e4e0a2a591c703bca751925ac9b9950fcdaf5e3f282e56833c9f881f174ddbff89cc"

RPROVIDES:${PN} += "ruby3.2-rubygem-base32 \
ruby3.2-rubygem-base32(aarch-64) \
rubygem(base32) \
rubygem(ruby:3.2.0:base32) \
rubygem(ruby:3.2.0:base32:0) \
rubygem(ruby:3.2.0:base32:0.3) \
rubygem(ruby:3.2.0:base32:0.3.4)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
