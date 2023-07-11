SUMMARY = "DLT - Diagnostic Log and Trace: Libraries"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Libraries."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-libs-2.18.8-4.5.aarch64.rpm"
RPM_HASH = "0ff9bb6089365b7974b835f177ab97edb21e5e08bb38b1971710db7393144f68810547d23dd357c5023d4cebeed8d4196143c1bdd827f24c14d9f1cc945a0536"

RPROVIDES:${PN} += "dlt-libs \
libdlt.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
