SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-6.0.17-1.5.aarch64.rpm"
RPM_HASH = "6b175b7b01ce584680edaa51f2924f7c36e3fa8ddc29541e2f8db61bc7f442088b4e198f96b88d49b31d544c899938b94d7d5118d4a4d0af9ce75c8dcc29a342"

RPROVIDES:${PN} += "config(rubygem-passenger) \
rubygem-passenger \
rubygem-passenger(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/node \
/usr/bin/ruby \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
rubygem(passenger) \
update-alternatives"

inherit rpm
