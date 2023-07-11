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

RPM_NAME = "python39-netaddr-0.8.0-3.3.noarch.rpm"
RPM_HASH = "0ce91f76590de5903a9523d958c429b4579bfa15d8ca915b9f84364e98b2c143bad92bd0ea443359ff2edd93f133dfdf9134dd18a9645476046eb0e867d0efdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-netaddr \
python39-netaddr \
python3dist-netaddr"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-importlib-metadata \
python39-importlib-resources \
update-alternatives"

inherit rpm
