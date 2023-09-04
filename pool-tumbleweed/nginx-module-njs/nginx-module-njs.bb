SUMMARY = "NGINX module for NGINX Javascript"
DESCRIPTION = "njs is a subset of the JavaScript language that allows extending \
nginx functionality."
LICENSE = "BSD-2-Clause"

PV = "0.7.12"

RPM_NAME = "nginx-module-njs-0.7.12-1.4.aarch64.rpm"
RPM_HASH = "80c483118c2d326dabc9a6a441d0190febc9b09767ddfe57277da881eaad9d88a35f7d50f417000a297eea407053b0afbfd0b8df6231b5b03bcb128c35f37110"

RPROVIDES:${PN} += "nginx-module-njs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libxml2.so.2 \
nginx"

inherit rpm
