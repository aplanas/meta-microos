SUMMARY = "Google's IP address manipulation library"
DESCRIPTION = "Google's IP address manipulation library. An IPv4/IPv6 manipulation library \
in Python. This library is used to create/poke/manipulate IPv4 and IPv6 \
addresses and prefixes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python310-ipaddr-2.2.0-1.18.noarch.rpm"
RPM_HASH = "e181522d796f6d9b51aefa940193a8896aa722db93f3ad0c1cf9df5461d2b54799c4e03772f333c885d8cfa7bbcdca85c720ec7247c983f7bc07211ac4a7f870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipaddr \
python310-ipaddr \
python3dist-ipaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
