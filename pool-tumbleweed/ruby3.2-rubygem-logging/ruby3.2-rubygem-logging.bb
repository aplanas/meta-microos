SUMMARY = "A flexible and extendable logging library for Ruby"
DESCRIPTION = "**Logging** is a flexible logging library for use in Ruby programs based on \
the \
design of Java's log4j library. It features a hierarchical logging system, \
custom level names, multiple output destinations per log event, custom \
formatting, and more."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ruby3.2-rubygem-logging-2.3.1-1.6.aarch64.rpm"
RPM_HASH = "56c26ad3d08142a5042e985418859a541f9c100c798e593ca961784516d51b5e6de82d7e40d87c1f9b81e287ff46cb15c0533c4c2b8c7ad30331884826d2474e"

RPROVIDES:${PN} += "ruby3.2-rubygem-logging \
ruby3.2-rubygem-logging(aarch-64) \
rubygem(logging) \
rubygem(ruby:3.2.0:logging) \
rubygem(ruby:3.2.0:logging:2) \
rubygem(ruby:3.2.0:logging:2.3) \
rubygem(ruby:3.2.0:logging:2.3.1)"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:little-plugger:1) \
rubygem(ruby:3.2.0:multi_json:1)"

inherit rpm
