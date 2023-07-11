SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-6.0.17-1.6.aarch64.rpm"
RPM_HASH = "0d2a5a291f4df9afae0af547407d53b16b67af0e0f52866be5e03d9a30707b273a95e64a529c20fca517369359bce1fce6cc7f8690a38d181bf290a73a0c8c23"

RPROVIDES:${PN} += "config-rubygem-passenger \
rubygem-passenger"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/ruby \
/usr/bin/sh \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
rubygem-passenger \
update-alternatives"

inherit rpm
