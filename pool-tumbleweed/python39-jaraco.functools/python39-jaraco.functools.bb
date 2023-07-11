SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python39-jaraco.functools-3.6.0-2.3.noarch.rpm"
RPM_HASH = "93e657a1063b00c37552e406e75d1dc4d0910ef3a3952d8df538d5459734b3f7cacc7911b097b6c3fa604ac383407f3e03f4f3eb416ea832d6babbb2ecbe7032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.functools \
python39-jaraco.functools \
python3dist-jaraco.functools"

RDEPENDS:${PN} += "python-abi \
python39-jaraco.packaging \
python39-more-itertools"

inherit rpm
