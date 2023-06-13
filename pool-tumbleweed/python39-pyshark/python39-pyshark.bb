SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "python39-pyshark-0.4.6-1.5.noarch.rpm"
RPM_HASH = "24eafdeffee550200f33a8560778b4667eb4c29edecc51c97fd4349c7fb9871e861346e6d4f34d5f1a69eb6ab93280f4c5a93b5a8a1d825a2b61c171ff1f237e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyshark) \
python39-pyshark \
python3dist(pyshark)"

RDEPENDS:${PN} += "python(abi) \
python39-lxml \
python39-py \
wireshark"

inherit rpm
