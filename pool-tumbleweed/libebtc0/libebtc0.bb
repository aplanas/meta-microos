SUMMARY = "Library for the ebtables low-level ruleset generation and parsing"
DESCRIPTION = "libebtc ('ebtables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.11"

RPM_NAME = "libebtc0-2.0.11-5.8.aarch64.rpm"
RPM_HASH = "657ed0d2397a32cf767515dbe5cfd794709a3e46cc0630628a87800d59e25edba1cd935cb5568ff69a9c24d4fafef4a5ddf820d814f8185638cfc8c74316e7aa"

RPROVIDES:${PN} += "libebtc.so.0 \
libebtc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
