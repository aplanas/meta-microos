SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "python39-pyshark-0.4.6-1.7.noarch.rpm"
RPM_HASH = "79280476ac1e338017484504b1bda90d5303e1891563b015d50037173f0ec99f19476c2cc2aeb7db97d458c49fa9e5ea4510257fae7e578fcd6323fa133beccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyshark \
python39-pyshark \
python3dist-pyshark"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-py \
wireshark"

inherit rpm
