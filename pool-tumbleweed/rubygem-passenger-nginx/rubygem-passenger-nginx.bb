SUMMARY = "Passenger Nginx module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the nginx sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-nginx-6.0.17-1.6.aarch64.rpm"
RPM_HASH = "fd3b16acc9a37a988de0bd402e8054d3b81fdb025033883ca40b8caaba926293685ff006035dd0d15350e1c2b4cdf4c5b2ef19a88db765653b0d7b1aef1e5522"

RPROVIDES:${PN} += "config-rubygem-passenger-nginx \
rubygem-passenger-nginx"

RDEPENDS:${PN} += "nginx \
rubygem-passenger"

inherit rpm
