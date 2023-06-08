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

RPM_NAME = "crash-doc-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "4c4836e1b19750a2e58bd0624c1f88fe748bfc2f2f83b18eaf7d5893b01b22d317acc2eea9df9e86c279fdd6d425cc87b9dee48d90a956dffddf65f6a632b217"

RPROVIDES:${PN} += "crash-doc crash-doc(aarch-64)"
RDEPENDS:${PN} += "crash"

inherit rpm
