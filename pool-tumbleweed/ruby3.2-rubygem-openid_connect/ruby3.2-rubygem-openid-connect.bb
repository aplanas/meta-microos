SUMMARY = "OpenID Connect Server & Client Library"
DESCRIPTION = "OpenID Connect Server & Client Library."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "ruby3.2-rubygem-openid_connect-2.2.0-1.5.aarch64.rpm"
RPM_HASH = "5fec017dd2f3bdb9b4a1deee5c797f677faef35d9ccb543b40b4b543e269329eda34b37aaad43d253fbfd88667730f05ca8f8ee6e5577024953dfb4c831bc805"

RPROVIDES:${PN} += "ruby3.2-rubygem-openid_connect \
ruby3.2-rubygem-openid_connect(aarch-64) \
rubygem(openid_connect) \
rubygem(ruby:3.2.0:openid_connect) \
rubygem(ruby:3.2.0:openid_connect:2) \
rubygem(ruby:3.2.0:openid_connect:2.2) \
rubygem(ruby:3.2.0:openid_connect:2.2.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activemodel) \
rubygem(ruby:3.2.0:attr_required) \
rubygem(ruby:3.2.0:faraday-follow_redirects) \
rubygem(ruby:3.2.0:faraday:2) \
rubygem(ruby:3.2.0:json-jwt) \
rubygem(ruby:3.2.0:net-smtp) \
rubygem(ruby:3.2.0:rack-oauth2:2) \
rubygem(ruby:3.2.0:swd:2) \
rubygem(ruby:3.2.0:tzinfo) \
rubygem(ruby:3.2.0:validate_email) \
rubygem(ruby:3.2.0:validate_url) \
rubygem(ruby:3.2.0:webfinger:2)"

inherit rpm
