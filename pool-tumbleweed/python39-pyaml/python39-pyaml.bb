SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "21.10.1"

RPM_NAME = "python39-pyaml-21.10.1-1.8.noarch.rpm"
RPM_HASH = "1c7a58dbbf350031dad7d4b9ec6f1ac7e31707a1cafb83b8a8bd1a5730dd4587e385bc82e1679bcf395b82acf6fc6abaf62a3dabb252bea65054f7acdc9212ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyaml) \
python39-pyaml \
python3dist(pyaml)"

RDEPENDS:${PN} += "python(abi) \
python39-PyYAML"

inherit rpm
