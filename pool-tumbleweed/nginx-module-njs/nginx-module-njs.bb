SUMMARY = "NGINX module for NGINX Javascript"
DESCRIPTION = "njs is a subset of the JavaScript language that allows extending \
nginx functionality."
LICENSE = "BSD-2-Clause"

PV = "0.7.12"

RPM_NAME = "nginx-module-njs-0.7.12-1.3.aarch64.rpm"
RPM_HASH = "c554a8930f1e22f2630a4ddf658d8d805e374b955a227eb21024a608b91e8aa513f239319e86d44135112143a6a55fe16f1f1da150de38775987d95d7ff3728e"

RPROVIDES:${PN} += "nginx-module-njs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libxml2.so.2 \
nginx"

inherit rpm
