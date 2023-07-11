SUMMARY = "GRPC system in Ruby"
DESCRIPTION = "Send RPCs from Ruby using GRPC."
LICENSE = "Apache-2.0"

PV = "1.55.0"

RPM_NAME = "ruby3.2-rubygem-grpc-1.55.0-1.2.aarch64.rpm"
RPM_HASH = "f115ca3388f4d5090c947ff22a8da961876b1c966b74f7aa36dc3d9830017dfb1d41fee72bba74eaa8ad5485b808cc2919b59d9cdc7fc741c01428228c3e0907"

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
