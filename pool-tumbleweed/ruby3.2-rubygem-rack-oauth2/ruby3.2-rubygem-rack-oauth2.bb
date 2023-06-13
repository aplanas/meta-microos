SUMMARY = "OAuth 2.0 Server & Client Library - Both Bearer token type are"
DESCRIPTION = "OAuth 2.0 Server & Client Library. Both Bearer token type are supported."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "ruby3.2-rubygem-rack-oauth2-2.2.0-1.5.aarch64.rpm"
RPM_HASH = "febba2502db19d8916408fc9ba65e48bc6bc97dd01a3ac541db9735157c266adf359b8acdc9b07ad72fdc6ac0666ea6e5306b37552087724f818586392798a89"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-oauth2 \
ruby3.2-rubygem-rack-oauth2(aarch-64) \
rubygem(rack-oauth2) \
rubygem(ruby:3.2.0:rack-oauth2) \
rubygem(ruby:3.2.0:rack-oauth2:2) \
rubygem(ruby:3.2.0:rack-oauth2:2.2) \
rubygem(ruby:3.2.0:rack-oauth2:2.2.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:attr_required) \
rubygem(ruby:3.2.0:faraday-follow_redirects) \
rubygem(ruby:3.2.0:faraday:2) \
rubygem(ruby:3.2.0:json-jwt) \
rubygem(ruby:3.2.0:rack)"

inherit rpm
