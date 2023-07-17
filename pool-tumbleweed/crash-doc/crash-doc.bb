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

RPM_NAME = "crash-doc-8.0.3-1.10.aarch64.rpm"
RPM_HASH = "7e3fc3f9dd23ec7dd69608789073a6d54e2ef1043117840bb227b8b414d42970959c921f04d0953f782d6a128231f5ca814685c63f6de3430ce1816f81d79868"

RPROVIDES:${PN} += "crash-doc"

RDEPENDS:${PN} += "crash"

inherit rpm
