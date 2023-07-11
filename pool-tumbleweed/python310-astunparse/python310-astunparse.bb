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

RPM_NAME = "python310-astunparse-1.6.3-5.3.aarch64.rpm"
RPM_HASH = "46a0e1dee412bf75b753c813b7b18af0f442d03e5360a62358b6c72854ecb91ab22f442d6667aae8fbdf1c6b35e55312dd7ef5f1fe3da330d1fb10c69a051d47"

RPROVIDES:${PN} += "python3.10dist-astunparse \
python310-astunparse \
python3dist-astunparse"

RDEPENDS:${PN} += "python-abi \
python310-six \
python310-wheel"

inherit rpm
