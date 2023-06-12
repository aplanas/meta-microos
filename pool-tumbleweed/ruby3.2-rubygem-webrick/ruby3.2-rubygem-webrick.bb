SUMMARY = "HTTP server toolkit"
DESCRIPTION = "WEBrick is an HTTP server toolkit that can be configured as an HTTPS server, a \
proxy server, and a virtual-host server."
LICENSE = "Ruby & BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "ruby3.2-rubygem-webrick-1.7.0-1.11.aarch64.rpm"
RPM_HASH = "396f3612a21e6fff45b342560c00433f115ac682650a666c1f8f821f3bba95d8358c55db2bd3bb22f777010cacbb3b8aede5c7b12cc6fbd855e15e158dd0d402"

RPROVIDES:${PN} += "ruby3.2-rubygem-webrick \
ruby3.2-rubygem-webrick(aarch-64) \
rubygem(ruby:3.2.0:webrick) \
rubygem(ruby:3.2.0:webrick:1) \
rubygem(ruby:3.2.0:webrick:1.7) \
rubygem(ruby:3.2.0:webrick:1.7.0) \
rubygem(webrick)"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
