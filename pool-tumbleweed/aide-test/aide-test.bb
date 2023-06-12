SUMMARY = "Simple AIDE testing"
DESCRIPTION = "Simple AIDE test script for externalized testing."
LICENSE = "GPL-2.0-or-later"

PV = "0.18.1"

RPM_NAME = "aide-test-0.18.1-1.3.aarch64.rpm"
RPM_HASH = "5922a28063537da6f590d325a2a7639371388f3c28cf76e0c6f7eed824b6eddc4cc1cd52a35916ef37266a9ee29fbc500f72c0249b0efe773fb909c4b6b3c0f4"

RPROVIDES:${PN} += "aide-test \
aide-test(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
