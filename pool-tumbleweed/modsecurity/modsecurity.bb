SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "BSD-2-Clause"

PV = "3.0.9"

RPM_NAME = "modsecurity-3.0.9-1.2.aarch64.rpm"
RPM_HASH = "f45d769d83831e407f489b12a58a53c945ee92ca3b3d115df63d1801f4b080090aee88dc0fcda3bd69441a66f5c1ba2dd99520508b56a29f14abe5ef718d2734"

RPROVIDES:${PN} += "modsecurity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmodsecurity.so.3 \
libstdc++.so.6"

inherit rpm
