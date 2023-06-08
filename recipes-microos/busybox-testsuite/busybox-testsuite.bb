SUMMARY = "Testsuite of busybox"
DESCRIPTION = "Using this package you can test the busybox build on different kernels and glibc. \
It needs to run with permission to the current directory, so either copy it away \
as is or run as root: \
 \
cd /usr/share/busybox/testsuite \
PATH=/usr/share/busybox:$PATH SKIP_KNOWN_BUGS=1 ./runtest"
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-testsuite-1.36.0-1.3.aarch64.rpm"
RPM_HASH = "7fc186aa93b96cf99750a15db59fc29eb06bc23a2b1ecace00fa17d9c95b509040079e7befef370407a2a9a4aab486d38ad7a81e7ab3754bf1bf8bca92ea2564"

RPROVIDES:${PN} += "busybox-testsuite busybox-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/sh busybox zip"

inherit rpm
