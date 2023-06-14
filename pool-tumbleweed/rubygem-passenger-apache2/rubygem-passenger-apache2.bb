SUMMARY = "Passenger apache module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the apache2 sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-apache2-6.0.17-1.5.aarch64.rpm"
RPM_HASH = "a10bd6093a4454c5a6cfcebe72725c0d5b60abd9cd4b19294c825474b0f2a289ee944671bf21059018d8eda380ff881844d85f1eac6f8c672f0b9c3fd908e4eb"

RPROVIDES:${PN} += "config-rubygem-passenger-apache2 \
rubygem-passenger-apache2"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
rubygem-passenger"

inherit rpm
