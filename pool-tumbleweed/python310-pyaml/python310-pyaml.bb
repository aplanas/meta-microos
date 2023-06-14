SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "21.10.1"

RPM_NAME = "python310-pyaml-21.10.1-1.8.noarch.rpm"
RPM_HASH = "9a08c3c6a64a82b191f0f4c672712d79d12c35b027b3b7d2d26e8555153eb18a0fbc75845d7d9d7866e398916703b38efb3389868e5e96cb63cf5642d0efee60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyaml \
python3.10dist-pyaml \
python310-pyaml \
python3dist-pyaml"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
