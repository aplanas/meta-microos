SUMMARY = "Nginx virtual host traffic status module"
DESCRIPTION = "This is an Nginx module that provides access to virtual host status \
information. It contains the current status such as servers, upstreams, caches. \
This is similar to the live activity monitoring of nginx plus. The built-in html \
is also taken from the demo page of old version."
LICENSE = "BSD-2-Clause"

PV = "0.1.18+g41"

RPM_NAME = "nginx-module-vts-0.1.18+g41-1.9.aarch64.rpm"
RPM_HASH = "17f6a4cdc8664ad287ecf7cf96ea269990fc9a9aba554b410bedbfcd7655795d016c7cecdce05982b41ef3ffd3474a513f351b298d8ce3bd7bdc5a9640027e0d"

RPROVIDES:${PN} += "nginx-module-vts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nginx"

inherit rpm
