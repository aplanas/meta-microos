SUMMARY = "Google's IP address manipulation library"
DESCRIPTION = "Google's IP address manipulation library. An IPv4/IPv6 manipulation library \
in Python. This library is used to create/poke/manipulate IPv4 and IPv6 \
addresses and prefixes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python311-ipaddr-2.2.0-1.18.noarch.rpm"
RPM_HASH = "3df5a91b4cced7dea28f85648f4da19bd8a5bebb27eede18c10b17f28d185a9c7f16bee9f9a50ae9e17daa8779cb51463d6f93c11cdccddba9dc2e21f31968bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipaddr \
python3.11dist-ipaddr \
python311-ipaddr \
python3dist-ipaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
