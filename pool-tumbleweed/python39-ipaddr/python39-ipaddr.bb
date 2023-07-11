SUMMARY = "Google's IP address manipulation library"
DESCRIPTION = "Google's IP address manipulation library. An IPv4/IPv6 manipulation library \
in Python. This library is used to create/poke/manipulate IPv4 and IPv6 \
addresses and prefixes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python39-ipaddr-2.2.0-1.18.noarch.rpm"
RPM_HASH = "744f43d9bb04cf83b737e80ac66b218cae8624545e4bfd2cd9321c3695081f3315ab2fbdd7b585e73cd4943e0d54c10659e41ea76fa74ce901bc20653897c1ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipaddr \
python39-ipaddr \
python3dist-ipaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
