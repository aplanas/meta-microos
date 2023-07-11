SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python39-dparse-0.6.3-1.1.noarch.rpm"
RPM_HASH = "899ac03a80ef106f5030c7121f67be942e09b5db1ccdb3cabd3483666753246178bbca60a923253ce3e44375d5e32896ef7fb63998fe156f9cde8410bee98581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dparse \
python39-dparse \
python3dist-dparse"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-packaging"

inherit rpm
