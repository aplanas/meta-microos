SUMMARY = "Documentation for Crash"
DESCRIPTION = "This subpackage contains the crash whitepaper from Dave Anderson. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only"

PV = "8.0.3"

RPM_NAME = "crash-doc-8.0.3-1.9.aarch64.rpm"
RPM_HASH = "b271adfc7d00da66b6bf8b9b051f551e9e5d09dd752346274a0e06fb978c5a3db43282c3f66e640d23b30c1bbf1b2daf6b4f5e6a009aa0d0346ca91316a96782"

RPROVIDES:${PN} += "crash-doc"

RDEPENDS:${PN} += "crash"

inherit rpm
