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

RPM_NAME = "crash-doc-8.0.3-1.4.aarch64.rpm"
RPM_HASH = "2e8f9dda16f59269b2b96abe879a60f5974b613279e9f1c632cc1c853c345ab2edf4f8d3f29c1d39a7e30ab0c690c4c2b746352a43d63cd387e0bda973c66b53"

RPROVIDES:${PN} += "crash-doc \
crash-doc(aarch-64)"
RDEPENDS:${PN} += "crash"

inherit rpm
