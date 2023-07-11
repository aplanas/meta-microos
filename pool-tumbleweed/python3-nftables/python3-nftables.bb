SUMMARY = "Python interface for nftables"
DESCRIPTION = "A Python module for nftables."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "python3-nftables-1.0.7-1.7.aarch64.rpm"
RPM_HASH = "457789036e414c781889a3d4145d2866e7f33472f8e5f4b629f8a9e0133c45cd753e68a8aefd6ae8436cc17d741b08384221435a5cb7a083e7d7b670cbb7b4e9"

RPROVIDES:${PN} += "python3-nftables \
python3.11dist-nftables \
python3dist-nftables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
