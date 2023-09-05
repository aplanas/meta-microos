SUMMARY = "Testsuite of busybox"
DESCRIPTION = "Using this package you can test the busybox build on different kernels and glibc. \
It needs to run with permission to the current directory, so either copy it away \
as is or run as root: \
 \
cd /usr/share/busybox/testsuite \
PATH=/usr/share/busybox:$PATH SKIP_KNOWN_BUGS=1 ./runtest"
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-testsuite-1.36.1-2.1.aarch64.rpm"
RPM_HASH = "0626228b715b917ab7d47bacd2835a1437f06ccb02559795e965d3d1b4b4875973d104495313c54fd4ecfcd631411487d5c766265715cbe8ea92256a18bd7427"

RPROVIDES:${PN} += "busybox-testsuite"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox \
zip"

inherit rpm
