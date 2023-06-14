SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "BSD-2-Clause"

PV = "3.0.9"

RPM_NAME = "modsecurity-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "8e5b028ef1b4140c4a191a6b2fda5cb383d22ed7be15f779234ec8650a8d2309a2b76ea0d50071ec9670da11ea42cff143cb3dc51bc5c3c43fa68b843b17dd7f"

RPROVIDES:${PN} += "modsecurity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmodsecurity.so.3 \
libstdc++.so.6"

inherit rpm
