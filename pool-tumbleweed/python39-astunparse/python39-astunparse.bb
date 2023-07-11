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

RPM_NAME = "python39-astunparse-1.6.3-5.3.aarch64.rpm"
RPM_HASH = "22089f4557bf45bb508ce8e1cb747c92f8b051cc50dcee5319a26691dc765bf6812d8249402306cb37d55a59c69ad4d5152a7faeab56143699fcce44f13d4f6d"

RPROVIDES:${PN} += "python3.9dist-astunparse \
python39-astunparse \
python3dist-astunparse"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-wheel"

inherit rpm
