SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "python311-pyshark-0.4.6-1.7.noarch.rpm"
RPM_HASH = "ba0f80f54be6c4c1824f5b5b69ecb95369b3623edcde4100235564cc7e29dcd8ffc2abff1e6dd75ee5413926240a0b493b10e195a32277811cac8322173f9189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshark \
python3.11dist-pyshark \
python311-pyshark \
python3dist-pyshark"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-py \
wireshark"

inherit rpm
