SUMMARY = "Tests for the package"
DESCRIPTION = "Upstream testsuite for the package"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-tests-1.34-12.1.aarch64.rpm"
RPM_HASH = "c6c10d2aba46f5edc02d5f9864a73e90985a52eefb6e0635b48264abb351a6351bad821984933c597a9014ad7cc2bd56677ca1634cdf285d5acb57400d0699e8"

RPROVIDES:${PN} += "tar-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
tar"

inherit rpm
