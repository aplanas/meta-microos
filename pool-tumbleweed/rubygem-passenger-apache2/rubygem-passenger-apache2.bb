SUMMARY = "Passenger apache module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the apache2 sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-apache2-6.0.17-1.6.aarch64.rpm"
RPM_HASH = "301760a07613cad1647006a198679f7801a5ebf74574c7e634096da50d15cf3b52d80dc40c13bc01f06fced3206aa9c46c21cdb979493321bb99d43b10d92a69"

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
