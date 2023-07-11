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

RPM_NAME = "python311-netaddr-0.8.0-3.3.noarch.rpm"
RPM_HASH = "593a69549a232963524dfe7f7b0aa44000558602f9e399799a0b08ccd788c00275921ae0a70b0fa885c77ab322747ebf5c4a923a6182888915bfd61338c2b1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netaddr \
python3.11dist-netaddr \
python311-netaddr \
python3dist-netaddr"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-importlib-metadata \
python311-importlib-resources \
update-alternatives"

inherit rpm
