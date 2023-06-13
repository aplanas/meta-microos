SUMMARY = "Boot large ruby/rails apps faster"
DESCRIPTION = "Boot large ruby/rails apps faster."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "ruby3.2-rubygem-bootsnap-1.15.0-1.4.aarch64.rpm"
RPM_HASH = "557ce182138df67b2ed30c6a358676d4748243832aba73f14a17659851c2a6ecb657be67acb624902b71c7108d9d5afb6185d8704099af3300a7e8d0cee8dc95"

RPROVIDES:${PN} += "ruby3.2-rubygem-bootsnap \
ruby3.2-rubygem-bootsnap(aarch-64) \
rubygem(bootsnap) \
rubygem(ruby:3.2.0:bootsnap) \
rubygem(ruby:3.2.0:bootsnap:1) \
rubygem(ruby:3.2.0:bootsnap:1.15) \
rubygem(ruby:3.2.0:bootsnap:1.15.0)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi) \
rubygem(ruby:3.2.0:msgpack:1) \
update-alternatives"

inherit rpm
