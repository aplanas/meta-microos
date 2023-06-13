SUMMARY = "A tool for measuring web server performance"
DESCRIPTION = "httperf is a tool for measuring web server performance. It provides a \
flexible facility for generating various HTTP workloads and for measuring \
server performance."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.9.0+git.20180712"

RPM_NAME = "httperf-0.9.0+git.20180712-1.19.aarch64.rpm"
RPM_HASH = "3fd2cba34ff5daccb6ea5268a56adff34b96b7e45088017400bb17c4fbe1ca68c6450ce65172eea1ad775d5b098079c91e14f4ca5525efe3614bdb31addb1531"

RPROVIDES:${PN} += "httperf \
httperf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
