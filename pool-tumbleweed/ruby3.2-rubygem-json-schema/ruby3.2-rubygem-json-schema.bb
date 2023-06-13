SUMMARY = "Ruby JSON Schema Validator"
DESCRIPTION = "Ruby JSON Schema Validator."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "ruby3.2-rubygem-json-schema-3.0.0-1.5.aarch64.rpm"
RPM_HASH = "db9a0f9076804275d6864887c91da952b5dc1da52c99e34922a4a739b4e8c1339b959f8ef5869ae23666575e214041344b2b6d5421702a00f0a56ce117bc2927"

RPROVIDES:${PN} += "ruby3.2-rubygem-json-schema \
ruby3.2-rubygem-json-schema(aarch-64) \
rubygem(json-schema) \
rubygem(ruby:3.2.0:json-schema) \
rubygem(ruby:3.2.0:json-schema:3) \
rubygem(ruby:3.2.0:json-schema:3.0) \
rubygem(ruby:3.2.0:json-schema:3.0.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:addressable)"

inherit rpm
