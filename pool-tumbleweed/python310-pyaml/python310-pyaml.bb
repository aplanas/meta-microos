SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "21.10.1"

RPM_NAME = "python310-pyaml-21.10.1-1.10.noarch.rpm"
RPM_HASH = "b81141af3a997b85f0cfba96e2da3001b6aee67fc0cc7b62c86f211e79faba93624d38de4d190179c4a533e1674b6230f426997c821c5c6891044de8dc2766bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyaml \
python310-pyaml \
python3dist-pyaml"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
