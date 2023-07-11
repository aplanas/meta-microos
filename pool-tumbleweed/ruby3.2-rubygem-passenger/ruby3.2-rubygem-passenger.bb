SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "ruby3.2-rubygem-passenger-6.0.17-1.6.aarch64.rpm"
RPM_HASH = "dcd7507ca262f6cea7f9a93faf01c0acc7bd04de47f8fb591dc59f718ad053701860c11c00fcb27f8a3478589c63712255e4def99e213a871bb65de1cfa6b36a"

RPROVIDES:${PN} += "ruby3.2-rubygem-passenger \
rubygem-passenger \
rubygem-ruby-3.2.0-passenger \
rubygem-ruby-3.2.0-passenger-6 \
rubygem-ruby-3.2.0-passenger-6.0 \
rubygem-ruby-3.2.0-passenger-6.0.17"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
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
