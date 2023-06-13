SUMMARY = "Generic extension manager for WebSocket connections"
DESCRIPTION = "Generic extension manager for WebSocket connections."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "ruby3.2-rubygem-websocket-extensions-0.1.5-1.16.aarch64.rpm"
RPM_HASH = "df18957df2fd96be1afacec45b3f7f722a026992cddf8d9ce2941b46862072c7df092a5437d9da7657df55ef5d38e7a58eb35c4e10dd16319646d2629b8c531d"

RPROVIDES:${PN} += "ruby3.2-rubygem-websocket-extensions \
ruby3.2-rubygem-websocket-extensions(aarch-64) \
rubygem(ruby:3.2.0:websocket-extensions) \
rubygem(ruby:3.2.0:websocket-extensions:0) \
rubygem(ruby:3.2.0:websocket-extensions:0.1) \
rubygem(ruby:3.2.0:websocket-extensions:0.1.5) \
rubygem(websocket-extensions)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
