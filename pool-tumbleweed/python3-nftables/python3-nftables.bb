SUMMARY = "Python interface for nftables"
DESCRIPTION = "A Python module for nftables."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "python3-nftables-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "6b8254e0372855a63fc6de51563d141389b4c00dc33c736b2c38f8176dc602c60bc5be770f08ffe021bd663f4ba593de92ecbd416bdaefba486a77e6d4a5de14"

RPROVIDES:${PN} += "python3-nftables \
python3-nftables(aarch-64) \
python3.10dist(nftables) \
python3dist(nftables)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
