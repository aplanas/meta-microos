SUMMARY = "A CLI tool to check XMPP SRV records"
DESCRIPTION = "A CLI tool to check XMPP SRV records."
LICENSE = "BSD-2-Clause"

PV = "0.3.6"

RPM_NAME = "xmpp-dns-0.3.6-1.3.aarch64.rpm"
RPM_HASH = "a394a041f3f713ad1d4f07bacb3f2199662c8e584960290191464eda8fcf1d62c5ac58e56b6046e3ff71282785b1c050f4c3a04050bad4254ea2191570d75e47"

RPROVIDES:${PN} += "xmpp-dns"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
