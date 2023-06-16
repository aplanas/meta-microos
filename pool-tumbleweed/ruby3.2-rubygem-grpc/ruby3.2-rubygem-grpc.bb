SUMMARY = "GRPC system in Ruby"
DESCRIPTION = "Send RPCs from Ruby using GRPC."
LICENSE = "Apache-2.0"

PV = "1.55.0"

RPM_NAME = "ruby3.2-rubygem-grpc-1.55.0-1.1.aarch64.rpm"
RPM_HASH = "7ecb78328f3f70f32f2b9bf800a4e020baeaf95c8b882a7bb9ee13d446e727f545266e24b3b61f9d4416b53c4d9a7c61ac186d6e30275a207f11b6791b299fa3"

RPROVIDES:${PN} += "ruby3.2-rubygem-grpc \
rubygem-grpc \
rubygem-ruby-3.2.0-grpc \
rubygem-ruby-3.2.0-grpc-1 \
rubygem-ruby-3.2.0-grpc-1.55 \
rubygem-ruby-3.2.0-grpc-1.55.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi \
rubygem-ruby-3.2.0-google-protobuf-3 \
rubygem-ruby-3.2.0-googleapis-common-protos-types-1"

inherit rpm
