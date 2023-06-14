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

RPM_NAME = "python311-netaddr-0.8.0-2.11.noarch.rpm"
RPM_HASH = "f6ad27a4f4bc2522bd6d63c6ee5e17c892275f5ffb8e7145154e19a9c467c4f0655e3f95622fd294007c29a5348848ec25cea488a4689501791e4f52b1cdc391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-netaddr \
python311-netaddr \
python3dist-netaddr"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-importlib-metadata \
python311-importlib-resources \
update-alternatives"

inherit rpm
