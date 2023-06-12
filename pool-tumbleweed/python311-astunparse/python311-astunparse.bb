SUMMARY = "An AST unparser for Python"
DESCRIPTION = "This is a factored out version of ``unparse`` found in the Python \
source distribution; under Demo/parser in Python 2 and under \
Tools/parser in Python 3. \
 \
This library is single-source compatible with Python 2.6 through \
Python 3.5. It is authored by the Python core developers; I have \
simply merged the Python 2.7 and the Python 3.5 source and test \
suites, and added a wrapper. This factoring out is to provide a \
library implementation that supports both versions. \
 \
Added to this is a pretty-printing dump utility function."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.6.3"

RPM_NAME = "python311-astunparse-1.6.3-5.1.aarch64.rpm"
RPM_HASH = "5a2cda21a7136558bedc9e4f0f97a63aa5d6962a645e004252c39bf22132db6b488fc5988ce9c4e42b5926ac8b1dea0f019952eab8a99b81f3a0011c055df437"

RPROVIDES:${PN} += "python3.11dist(astunparse) \
python311-astunparse \
python311-astunparse(aarch-64) \
python3dist(astunparse)"
RDEPENDS:${PN} += "python(abi) \
python311-six \
python311-wheel"

inherit rpm
