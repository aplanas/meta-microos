SUMMARY = "A Ruby library to handle HTTP Cookies based on RFC 6265"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265.  It \
has with security, standards compliance and compatibility in mind, to behave \
just the same as today's major web browsers.  It has builtin support for the \
legacy cookies.txt and the latest cookies.sqlite formats of Mozilla Firefox, \
and its modular API makes it easy to add support for a new backend store."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "ruby3.2-rubygem-http-cookie-1.0.5-1.5.aarch64.rpm"
RPM_HASH = "901933623c0260e2655592774a52cdf17b12a4a3e6705bed433ce428de42af1ffe0edf7dfa631bb35e7dd0ff0fe74a17acdaa1035d1f5700fa640609a29bab0d"

RPROVIDES:${PN} += "ruby3.2-rubygem-http-cookie \
ruby3.2-rubygem-http-cookie(aarch-64) \
rubygem(http-cookie) \
rubygem(ruby:3.2.0:http-cookie) \
rubygem(ruby:3.2.0:http-cookie:1) \
rubygem(ruby:3.2.0:http-cookie:1.0) \
rubygem(ruby:3.2.0:http-cookie:1.0.5)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:domain_name:0)"

inherit rpm
