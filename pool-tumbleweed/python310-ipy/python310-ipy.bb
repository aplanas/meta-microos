SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python310-ipy-1.01-1.11.noarch.rpm"
RPM_HASH = "91f54a43d497d1515fcab8230a520e1ca7b4d89d31f051088c81f91d7bae0066f4c44aac687603e7cd9068aa488dea3e40e462cb398ae64c8c3a9ff746e4c638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipy \
python310-ipy \
python3dist-ipy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
