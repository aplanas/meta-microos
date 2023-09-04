SUMMARY = "DLT - Diagnostic Log and Trace: Libraries"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Libraries."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-libs-2.18.8-4.6.aarch64.rpm"
RPM_HASH = "81f0ebe0651a9618c23e8fed486e358ab9845b4d4a06811a8a07de3313e17f7257f58e4eb2250a467c27a83e84cc22ea5fff64a135f99b17fb189b969b8751a7"

RPROVIDES:${PN} += "dlt-libs \
libdlt.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
