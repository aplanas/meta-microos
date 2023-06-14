SUMMARY = "Google's IP address manipulation library"
DESCRIPTION = "Google's IP address manipulation library. An IPv4/IPv6 manipulation library \
in Python. This library is used to create/poke/manipulate IPv4 and IPv6 \
addresses and prefixes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python39-ipaddr-2.2.0-1.16.noarch.rpm"
RPM_HASH = "4bc3f64e2a9fcbd6a758df0feacbab1e72bbcf34c5449eafcd82c2397fb105788d6bb6aed79cff72e96874965373443c3fb494b8eac7713e99d703828b1edeb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipaddr \
python39-ipaddr \
python3dist-ipaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
