SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-s390x-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "3dc8097baa3c927104112d93f287e5760c0645dd877e873640fc606afa7d40be69a3e74e849bf55cb96e82413e72e369fc49d937212b2b96130c012500b6c18e"

RPROVIDES:${PN} += "cross-s390x-gcc13-icecream-backend \
cross-s390x-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
