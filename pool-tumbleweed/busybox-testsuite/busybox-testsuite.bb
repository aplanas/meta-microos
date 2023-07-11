SUMMARY = "Testsuite of busybox"
DESCRIPTION = "Using this package you can test the busybox build on different kernels and glibc. \
It needs to run with permission to the current directory, so either copy it away \
as is or run as root: \
 \
cd /usr/share/busybox/testsuite \
PATH=/usr/share/busybox:$PATH SKIP_KNOWN_BUGS=1 ./runtest"
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-testsuite-1.36.1-1.1.aarch64.rpm"
RPM_HASH = "ccc54bab78072d7578549f69691eb9a71d64e864813fa7ddde6f0551cf3497ad60fe91d2759dc412acc3853259d1f4e68274b02fdfa96ad5a7bdc3c62b421f48"

RPROVIDES:${PN} += "busybox-testsuite"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox \
zip"

inherit rpm
