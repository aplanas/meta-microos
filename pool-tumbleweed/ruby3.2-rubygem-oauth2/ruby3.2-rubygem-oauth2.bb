SUMMARY = "A Ruby wrapper for the OAuth 2.0 protocol"
DESCRIPTION = "A Ruby wrapper for the OAuth 2.0 protocol built with a similar style to the \
original OAuth spec."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "ruby3.2-rubygem-oauth2-2.0.9-1.5.aarch64.rpm"
RPM_HASH = "4aa221a7e337f1b661ff663b0344589a0a86f6c68e3dc02529600bc6a057bdc38696537ead87c02a72c61d93ec3605d169f86c4f74c311cb9d4e84766af65de4"

RPROVIDES:${PN} += "ruby3.2-rubygem-oauth2 \
ruby3.2-rubygem-oauth2(aarch-64) \
rubygem(oauth2) \
rubygem(ruby:3.2.0:oauth2) \
rubygem(ruby:3.2.0:oauth2:2) \
rubygem(ruby:3.2.0:oauth2:2.0) \
rubygem(ruby:3.2.0:oauth2:2.0.9)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:faraday) \
rubygem(ruby:3.2.0:jwt) \
rubygem(ruby:3.2.0:multi_xml:0) \
rubygem(ruby:3.2.0:rack) \
rubygem(ruby:3.2.0:snaky_hash:2) \
rubygem(ruby:3.2.0:version_gem:1)"

inherit rpm
