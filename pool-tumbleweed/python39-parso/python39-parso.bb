SUMMARY = "An autocompletion tool for Python"
DESCRIPTION = "Parso is a Python parser that supports error recovery and round-trip \
parsing for different Python versions (in multiple Python \
versions). Parso is also able to list multiple syntax errors in your \
python file. \
 \
Parso has been battle-tested by jedi. It was pulled out of jedi to be \
useful for other projects as well. \
 \
Parso consists of a small API to parse Python and analyse the syntax \
tree."
LICENSE = "MIT & Python-2.0"

PV = "0.8.3"

RPM_NAME = "python39-parso-0.8.3-3.1.noarch.rpm"
RPM_HASH = "8f86cd440f0b075aab9b18b33c313bdddf4d3c29eec70954e63869b2dae4854487bc391357d67ede9718768d8d35fc9c1220cbcb63f66b7220d6d703d0b938d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parso) \
python39-parso \
python3dist(parso)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
