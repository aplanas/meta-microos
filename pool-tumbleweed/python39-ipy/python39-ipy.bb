SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python39-ipy-1.01-1.11.noarch.rpm"
RPM_HASH = "b90200429ddc09fcc4e25465359b91480d39cb40138b7961fcb818452575f785d7c5cc0466ff5c2eeb4b952a59b3a298f6f386f7e7788df87bedb6bf5ad31546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipy \
python39-ipy \
python3dist-ipy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
