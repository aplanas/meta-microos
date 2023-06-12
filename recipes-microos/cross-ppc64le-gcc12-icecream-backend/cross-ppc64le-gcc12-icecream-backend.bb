SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64le-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "2e05c237d5342bf6093ba572c29e09a6491a6f1632af7d87f2c059b06cbfc515dc1ff02f0afe11d99e345123d837661ab71a6679769d6d939e0acc3bb02bd891"

RPROVIDES:${PN} += "cross-ppc64le-gcc12-icecream-backend \
cross-ppc64le-gcc12-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
