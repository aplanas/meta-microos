SUMMARY = "real-time stats for preforking Rack servers"
DESCRIPTION = "raindrops is a real-time stats toolkit to show statistics for Rack HTTP \
servers.  It is designed for preforking servers such as unicorn, but \
should support any Rack HTTP server on platforms supporting POSIX shared \
memory.  It may also be used as a generic scoreboard for sharing atomic \
counters across multiple processes."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.0"

RPM_NAME = "ruby3.2-rubygem-raindrops-0.20.0-1.12.aarch64.rpm"
RPM_HASH = "6d36c438953dd1649abfc07cea61441d9c7162897348aa66c245f536cb065fc8df4a8a8f8aec7f6f93c92a8416a87b59f9689fd82afd51bb7532873b6b5a2958"

RPROVIDES:${PN} += "ruby3.2-rubygem-raindrops \
rubygem-raindrops \
rubygem-ruby-3.2.0-raindrops \
rubygem-ruby-3.2.0-raindrops-0 \
rubygem-ruby-3.2.0-raindrops-0.20 \
rubygem-ruby-3.2.0-raindrops-0.20.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
