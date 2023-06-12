SUMMARY = "Protocol Buffers"
DESCRIPTION = "Protocol Buffers are Google's data interchange format."
LICENSE = "BSD-3-Clause"

PV = "3.23.1"

RPM_NAME = "ruby3.2-rubygem-google-protobuf-3.23.1-1.1.aarch64.rpm"
RPM_HASH = "75eafa5e0bc2b22f962c6e25ec1cec5669e8ba45ead1bd82563c5c87da440c1a0065ff4fce807fc39893b8b67be6f88f03e9b91b9a5e083dad4c846d089b2fa4"

RPROVIDES:${PN} += "ruby3.2-rubygem-google-protobuf \
ruby3.2-rubygem-google-protobuf(aarch-64) \
rubygem(google-protobuf) \
rubygem(ruby:3.2.0:google-protobuf) \
rubygem(ruby:3.2.0:google-protobuf:3) \
rubygem(ruby:3.2.0:google-protobuf:3.23) \
rubygem(ruby:3.2.0:google-protobuf:3.23.1)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
