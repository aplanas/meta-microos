SUMMARY = "SBLIM Base Instrumentation (test suite)"
DESCRIPTION = "Test suite for the Standards Based Linux Instrumentation Base Providers"
LICENSE = "EPL-1.0"

PV = "1.6.4"

RPM_NAME = "sblim-cmpi-base-testsuite-1.6.4-7.16.aarch64.rpm"
RPM_HASH = "70bc530d4af17e01e494e664cf8a089d7d49f4fb4352a6c9446a71f94b52089e6cad57466df2058edcd13ee5ec942b711f8b6be320f971e07b1523a8105e6129"

RPROVIDES:${PN} += "sblim-cmpi-base-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
sblim-cmpi-base \
sblim-testsuite"

inherit rpm
