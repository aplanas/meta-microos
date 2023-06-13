SUMMARY = "Google's IP address manipulation library"
DESCRIPTION = "Google's IP address manipulation library. An IPv4/IPv6 manipulation library \
in Python. This library is used to create/poke/manipulate IPv4 and IPv6 \
addresses and prefixes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python311-ipaddr-2.2.0-1.16.noarch.rpm"
RPM_HASH = "b193075746ceb48c82cbdb0d291695495b026dd9e802e1c40ab978b82fbf06422a38473442ec770b88d8a37f1538d4813ece8b431e1a3b05f807e1678f12c2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipaddr) \
python311-ipaddr \
python3dist(ipaddr)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
