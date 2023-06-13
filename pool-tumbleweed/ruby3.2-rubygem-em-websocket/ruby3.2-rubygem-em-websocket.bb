SUMMARY = "EventMachine based WebSocket server"
DESCRIPTION = "EventMachine based WebSocket server."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "ruby3.2-rubygem-em-websocket-0.5.3-1.9.aarch64.rpm"
RPM_HASH = "e7cc8894db2991d3339a2db5653ee680dd2e12f63e3cef14cf897679c4604b03c69b14e3876ca4b58e46a92a8af6a99f9565c6d8f4ae446009e771824d1b9214"

RPROVIDES:${PN} += "ruby3.2-rubygem-em-websocket \
ruby3.2-rubygem-em-websocket(aarch-64) \
rubygem(em-websocket) \
rubygem(ruby:3.2.0:em-websocket) \
rubygem(ruby:3.2.0:em-websocket:0) \
rubygem(ruby:3.2.0:em-websocket:0.5) \
rubygem(ruby:3.2.0:em-websocket:0.5.3)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:eventmachine) \
rubygem(ruby:3.2.0:http_parser.rb)"

inherit rpm
