SUMMARY = "Pythonic manipulation of IPv4, IPv6, CIDR, EUI and MAC network addresses"
DESCRIPTION = "A pure Python network address representation and manipulation library. \
 \
netaddr provides a Pythonic way of working with: \
    - IPv4 and IPv6 addresses and subnets (including CIDR notation); \
    - MAC (Media Access Control) addresses in multiple formats; \
    - IEEE EUI-64, OUI and IAB identifiers; \
    - a user friendly IP glob-style format. \
 \
Included are routines for: \
    - generating, sorting and summarizing IP addresses; \
    - converting IP addresses and ranges between various different formats; \
    - performing set based operations on groups of IP addresses and subnets; \
    - arbitrary IP address range calculations and conversions; \
    - querying IEEE OUI and IAB organisational information; \
    - querying of IP standards related data from key IANA data sources."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python310-netaddr-0.8.0-3.3.noarch.rpm"
RPM_HASH = "4db45dea932935126751b42b5905c20bcd7771eedbcfa15521b47edfda431638cbc63830d5b81b0dc48d93867cd5fd9b5888bb30c223988d58e43d9cae7aea18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-netaddr \
python310-netaddr \
python3dist-netaddr"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-importlib-metadata \
python310-importlib-resources \
update-alternatives"

inherit rpm
