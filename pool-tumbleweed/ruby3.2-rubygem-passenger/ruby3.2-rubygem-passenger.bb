SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "ruby3.2-rubygem-passenger-6.0.17-1.5.aarch64.rpm"
RPM_HASH = "2f56783b1a1c7313d68ad3b5db2546690716f3f9335efd073136587b1db4ede943a1bc80e504a2a8b19573f26bdb32b19df55579229a1746512f7b0ff92b6ce0"

RPROVIDES:${PN} += "ruby3.2-rubygem-passenger \
rubygem-passenger \
rubygem-ruby-3.2.0-passenger \
rubygem-ruby-3.2.0-passenger-6 \
rubygem-ruby-3.2.0-passenger-6.0 \
rubygem-ruby-3.2.0-passenger-6.0.17"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/node \
/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi \
rubygem-passenger \
rubygem-ruby-3.2.0-rack \
rubygem-ruby-3.2.0-rake \
update-alternatives"

inherit rpm
