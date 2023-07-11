SUMMARY = "Simple callback-based HTTP request/response parser"
DESCRIPTION = "Ruby bindings to https://github.com/joyent/http-parser and \
https://github.com/http-parser/http-parser.java."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "ruby3.2-rubygem-http_parser.rb-0.8.0-1.13.aarch64.rpm"
RPM_HASH = "729ac8f8a877559b4dae5eb7de6bf373b8151a1b46b2411088c72f4417ceb00dc539a433862aca784402886cd0f0a79413de1ccf3dad57f58856b9d1dda62b78"

RPROVIDES:${PN} += "ruby3.2-rubygem-http-parser.rb \
rubygem-http-parser.rb \
rubygem-ruby-3.2.0-http-parser.rb \
rubygem-ruby-3.2.0-http-parser.rb-0 \
rubygem-ruby-3.2.0-http-parser.rb-0.8 \
rubygem-ruby-3.2.0-http-parser.rb-0.8.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
