SUMMARY = "New IO for Ruby"
DESCRIPTION = "Cross-platform asynchronous I/O primitives for scalable network clients and \
servers. Inspired by the Java NIO API, but simplified for ease-of-use."
LICENSE = "MIT"

PV = "2.5.8"

RPM_NAME = "ruby3.2-rubygem-nio4r-2.5.8-1.13.aarch64.rpm"
RPM_HASH = "a59f781803726bf474d900dad7a7741a797e7ef501c60707943b2893cf72feb3827538f64df837e5f57f4e9b020b0cb4dac50dcb7b48d3106e37347d94498b95"

RPROVIDES:${PN} += "ruby3.2-rubygem-nio4r \
ruby3.2-rubygem-nio4r(aarch-64) \
rubygem(nio4r) \
rubygem(ruby:3.2.0:nio4r) \
rubygem(ruby:3.2.0:nio4r:2) \
rubygem(ruby:3.2.0:nio4r:2.5) \
rubygem(ruby:3.2.0:nio4r:2.5.8)"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
