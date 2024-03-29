SUMMARY = "Performance, overhead, and scalability benchmark for the Linux scheduler"
DESCRIPTION = "The hackbench test is a benchmark for measuring the performance, \
overhead, and scalability of the Linux scheduler."
LICENSE = "GPL-2.0+"

PV = "svn1649"

RPM_NAME = "hackbench-svn1649-63.25.aarch64.rpm"
RPM_HASH = "827aa29488a9e5e66ebf7bc9c21c713d2a36f57ea549d60ad80d25e3caa1d47b7a17913df606d7303d3f7cab33a35c2a74c94012037654c647417650f44c414b"

RPROVIDES:${PN} += "hackbench"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
