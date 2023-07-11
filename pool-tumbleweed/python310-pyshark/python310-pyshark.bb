SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "python310-pyshark-0.4.6-1.7.noarch.rpm"
RPM_HASH = "f6c1eca354b15468068d852f92cb7354565e784107ba2fd3059c9370635031fe323d943166f6ead6abc5cf5dc71530967b2e584263dfc69e2fd52b039dd1d8f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyshark \
python310-pyshark \
python3dist-pyshark"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-py \
wireshark"

inherit rpm
