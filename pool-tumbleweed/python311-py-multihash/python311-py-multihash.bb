SUMMARY = "Multihash implementation in Python"
DESCRIPTION = "Multihash is a protocol for differentiating outputs from \
various well-established hash functions, addressing size \
and encoding considerations."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-py-multihash-2.0.1-1.11.noarch.rpm"
RPM_HASH = "0f391a6436eb385a96580a1f7aa18566c1abff1c41dbe3eec4bbaa4fc1b0e46c20f59588e5e6459e46423a967d7967b404df778e129e6b8c715b0aad0110420d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-multihash \
python3.11dist-py-multihash \
python311-py-multihash \
python3dist-py-multihash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
