SUMMARY = "Remote backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the remote backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.8.0"

RPM_NAME = "pdns-backend-remote-4.8.0-1.1.aarch64.rpm"
RPM_HASH = "13e4f80f929d8f97aa5ec0d23c5e490a7ba2ede6bbfb7c44dee8187e4254ecdcd41623637e8f3a9dc59fecd9b6e5441c9f415add13ac55b9148ecf20ce916bef"

RPROVIDES:${PN} += "libremotebackend.so \
pdns-backend-remote"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzmq.so.5 \
pdns"

inherit rpm
