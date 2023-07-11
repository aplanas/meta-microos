SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "21.10.1"

RPM_NAME = "python39-pyaml-21.10.1-1.10.noarch.rpm"
RPM_HASH = "e8a4c547c6e6329a49af28bb8152d58e2e239412e62454015b68a29aca546ba016b045300e9e32af3d77e7da72c550b943ee04623d9151d195738cc432cf0285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyaml \
python39-pyaml \
python3dist-pyaml"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML"

inherit rpm
