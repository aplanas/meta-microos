SUMMARY = "Use libsass with Ruby!"
DESCRIPTION = "Use libsass with Ruby!."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby3.2-rubygem-sassc-2.4.0-2.15.aarch64.rpm"
RPM_HASH = "437743f52399e03ab1711e4772bb7fef174d9fae7a7d7061e077cf9186fc01843da0fe2c63863f08e2397721ae17ec0e152b3e8fd78042bf676e7ccf29a43027"

RPROVIDES:${PN} += "libsass.so \
ruby3.2-rubygem-sassc \
rubygem-ruby-3.2.0-sassc \
rubygem-ruby-3.2.0-sassc-2 \
rubygem-ruby-3.2.0-sassc-2.4 \
rubygem-ruby-3.2.0-sassc-2.4.0 \
rubygem-sassc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ruby-abi \
rubygem-ruby-3.2.0-ffi-1"

inherit rpm
