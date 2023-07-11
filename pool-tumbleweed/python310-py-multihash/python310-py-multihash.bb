SUMMARY = "Multihash implementation in Python"
DESCRIPTION = "Multihash is a protocol for differentiating outputs from \
various well-established hash functions, addressing size \
and encoding considerations."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-py-multihash-2.0.1-1.11.noarch.rpm"
RPM_HASH = "ae304106bb55da2e6d2b209240f311bd503cffb934c0f4b277194624c89b385607c63aeb95274392a965717b944443fd7690d407c413c0287939e77549da85bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py-multihash \
python310-py-multihash \
python3dist-py-multihash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
