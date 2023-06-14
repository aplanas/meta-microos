SUMMARY = "Use libsass with Ruby!"
DESCRIPTION = "Use libsass with Ruby!."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby3.2-rubygem-sassc-2.4.0-2.14.aarch64.rpm"
RPM_HASH = "838ecce7f69a1294ded618d6730aa1e9e9c8b1c52e10b008bf6cabf7c241bad13b0507e76715d9b79c12e6f38b890f0cb93b2167b462adb4e4813749e538869a"

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
