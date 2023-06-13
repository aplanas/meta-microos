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

RPM_NAME = "python310-netaddr-0.8.0-2.11.noarch.rpm"
RPM_HASH = "abe89da6af30883e6b5c2b93be56c0c5fd94d53138de867d6965476fbb833849e1733379774863862bcc3dcc312a8e936e61c500f29c24ff6cbac754379350eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netaddr \
python3.10dist(netaddr) \
python310-netaddr \
python3dist(netaddr)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-importlib-metadata \
python310-importlib_resources \
update-alternatives"

inherit rpm
