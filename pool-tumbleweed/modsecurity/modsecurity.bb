SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "BSD-2-Clause"

PV = "3.0.10"

RPM_NAME = "modsecurity-3.0.10-1.1.aarch64.rpm"
RPM_HASH = "dc792871834eb26e006a8ce39288576ed28f1e8685c39e1c7b116687c67454641320c9319d171cade2f1e3c5b0766cd5b65686c2d8941a4c32ecb70219737f36"

RPROVIDES:${PN} += "modsecurity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmodsecurity.so.3 \
libstdc++.so.6"

inherit rpm
