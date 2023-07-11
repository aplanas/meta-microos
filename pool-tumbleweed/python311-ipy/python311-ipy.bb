SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python311-ipy-1.01-1.11.noarch.rpm"
RPM_HASH = "7d1c69371d73f0831eed50c18615050720ffe5205998fc4d860dad2f9c847a925fd22509cb408673d0dda1af99bc510a268ded2da5b2689e46dfd4c0cfba0bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipy \
python3.11dist-ipy \
python311-ipy \
python3dist-ipy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
