SUMMARY = "HTTP/REST API client library"
DESCRIPTION = "HTTP/REST API client library."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "ruby3.2-rubygem-faraday-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "b0ea891cd963fe09689a58c4f0df1814b8a39610c435317ecd29b91043bf1ff7b749573b458c737b9e5626a052603aca4a99a5bcf1149cb2f68c39cdfc278cdd"

RPROVIDES:${PN} += "ruby3.2-rubygem-faraday \
ruby3.2-rubygem-faraday(aarch-64) \
rubygem(faraday) \
rubygem(ruby:3.2.0:faraday) \
rubygem(ruby:3.2.0:faraday:2) \
rubygem(ruby:3.2.0:faraday:2.7) \
rubygem(ruby:3.2.0:faraday:2.7.1)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:faraday-net_http) \
rubygem(ruby:3.2.0:ruby2_keywords)"

inherit rpm
