SUMMARY = "A CLI tool to check XMPP SRV records"
DESCRIPTION = "A CLI tool to check XMPP SRV records."
LICENSE = "BSD-2-Clause"

PV = "0.3.8"

RPM_NAME = "xmpp-dns-0.3.8-1.1.aarch64.rpm"
RPM_HASH = "05ad9b6d3f96045412e869dabf392b529e71973952359331dbd7dba4acbdc2f10c986c16a4d0e48a1faf8cd49e3ee5b2b52130a25f4803146866a18487da0fe9"

RPROVIDES:${PN} += "xmpp-dns"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
