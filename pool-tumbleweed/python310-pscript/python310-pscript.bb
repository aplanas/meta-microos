SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python310-pscript-0.7.7-1.5.noarch.rpm"
RPM_HASH = "ec2dde4f259ebc4d3e9f60a0a0852356e30ef72d63349a7d32db87e9e12e145bd6c32d18448cb26f15ae55d19926625a3d7625893d7e477a4a7d4d7beac04b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pscript \
python3.10dist-pscript \
python310-pscript \
python3dist-pscript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
