SUMMARY = "Simple callback-based HTTP request/response parser"
DESCRIPTION = "Ruby bindings to https://github.com/joyent/http-parser and \
https://github.com/http-parser/http-parser.java."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "ruby3.2-rubygem-http_parser.rb-0.8.0-1.12.aarch64.rpm"
RPM_HASH = "e2dd45a89076e061349668d7e79b391225214287b092691c876323c05fa67ae8e796347469007e0a56488e13195311b6681f2ca950cc2ee99a53497250742531"

RPROVIDES:${PN} += "ruby3.2-rubygem-http_parser.rb \
ruby3.2-rubygem-http_parser.rb(aarch-64) \
rubygem(http_parser.rb) \
rubygem(ruby:3.2.0:http_parser.rb) \
rubygem(ruby:3.2.0:http_parser.rb:0) \
rubygem(ruby:3.2.0:http_parser.rb:0.8) \
rubygem(ruby:3.2.0:http_parser.rb:0.8.0)"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
