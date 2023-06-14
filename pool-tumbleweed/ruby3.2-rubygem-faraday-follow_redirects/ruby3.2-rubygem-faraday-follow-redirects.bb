SUMMARY = "Faraday 2.x compatible extraction of"
DESCRIPTION = "Faraday 2.x compatible extraction of FaradayMiddleware::FollowRedirects."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "ruby3.2-rubygem-faraday-follow_redirects-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "e1670d478795b30758d701c39b7da8b9091ad0b95efa88f0842604b922f83ada942f55506180a044cdce20ee82bde4dad7d25416f8597fdeeb6065545aa0464e"

RPROVIDES:${PN} += "ruby3.2-rubygem-faraday-follow-redirects \
rubygem-faraday-follow-redirects \
rubygem-ruby-3.2.0-faraday-follow-redirects \
rubygem-ruby-3.2.0-faraday-follow-redirects-0 \
rubygem-ruby-3.2.0-faraday-follow-redirects-0.3 \
rubygem-ruby-3.2.0-faraday-follow-redirects-0.3.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-faraday"

inherit rpm
