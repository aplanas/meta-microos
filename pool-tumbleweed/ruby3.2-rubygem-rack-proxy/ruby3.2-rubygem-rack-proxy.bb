SUMMARY = "A request/response rewriting HTTP proxy. A Rack app"
DESCRIPTION = "A Rack app that provides request/response rewriting proxy capabilities with \
streaming."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "ruby3.2-rubygem-rack-proxy-0.7.4-1.5.aarch64.rpm"
RPM_HASH = "1edb6de109951bb2225902210f06a98fbcdafee05bd9a1378e45f1662c496a0e0c4827e5a7fe04a15a4309b7e50db6d1b5b5944d2881c31e45c05f5c70315191"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-proxy \
rubygem-rack-proxy \
rubygem-ruby-3.2.0-rack-proxy \
rubygem-ruby-3.2.0-rack-proxy-0 \
rubygem-ruby-3.2.0-rack-proxy-0.7 \
rubygem-ruby-3.2.0-rack-proxy-0.7.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-rack"

inherit rpm
