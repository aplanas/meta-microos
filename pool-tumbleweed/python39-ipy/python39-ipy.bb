SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python39-ipy-1.01-1.10.noarch.rpm"
RPM_HASH = "7e393d63695579dcfa840dd397b5c7e1a7b9b25cf62e3b4571181fddfea0ecfc2d2dc8842ef36c4bec378b4fd19f37850e7df3e18487d181ce16bdd24ca92536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipy \
python39-ipy \
python3dist-ipy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
