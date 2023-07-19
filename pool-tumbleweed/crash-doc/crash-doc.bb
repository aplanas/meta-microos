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

RPM_NAME = "crash-doc-8.0.3-1.11.aarch64.rpm"
RPM_HASH = "813abb7a64926a29a47300ca9e80f2b23260b9a536e44cd4804681cc98a35c237bcf9b26098d8c745990bb8683aaded43e9a5d84b3a1b522b2e3875fe3fc4c90"

RPROVIDES:${PN} += "crash-doc"

RDEPENDS:${PN} += "crash"

inherit rpm
