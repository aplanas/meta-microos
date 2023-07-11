SUMMARY = "Link Layer Discovery Protocol (LLDP) libraries"
DESCRIPTION = "This package contains the Link Layer Discovery Protocol (LLDP) libraries"
LICENSE = "GPL-2.0-only"

PV = "1.1+58.8ca361bab766"

RPM_NAME = "liblldp_clif1-1.1+58.8ca361bab766-1.4.aarch64.rpm"
RPM_HASH = "197258a579381eb48652edfd5f1ca9e3f6f74e91a1d75c6a56d763d5d5da4e34bc0826e77c5d6723bf762cf08dab94cc1403324efe26f8332bad918fe0dffe92"

RPROVIDES:${PN} += "liblldp-clif.so.1 \
liblldp-clif1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
