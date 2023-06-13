SUMMARY = "Test plugin for health-checker"
DESCRIPTION = "This package contains a script for testing the CaaSP health checker. \
It will report success or failures depending on previous states."
LICENSE = "GPL-2.0-only"

PV = "1.8"

RPM_NAME = "health-checker-testing-1.8-1.1.noarch.rpm"
RPM_HASH = "e091008f38fffef0523f719302ae725fe9c253a04bca25cfff5bbb088033859aba40c92f45242806f7f1405365680bb98fa2fa9f76f595211857215cb260dbbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-testing"

RDEPENDS:${PN} += "/bin/bash \
health-checker"

inherit rpm
