SUMMARY = "Multicast Server and Client application"
DESCRIPTION = "Simple multicast Server/Client application. \
Supports: \
 \
 * IPv4 AND IPv6 \
 * Multicast Server \
 * Multicast client \
 * Source Specific Multicast client"
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "simple-multicast-0.2.4-1.11.aarch64.rpm"
RPM_HASH = "88b26739ccc7b2499d874a3027dd1764e0f6a86b8e7f6275ac0fd0f15b1ea57ea302b657db00f307521bb8cd39c8253ee2e294045ed6a3425dae84bacec89e0f"

RPROVIDES:${PN} += "simple-multicast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
