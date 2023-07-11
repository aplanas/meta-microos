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

RPM_NAME = "python311-astunparse-1.6.3-5.3.aarch64.rpm"
RPM_HASH = "e5e4db8b8bfed7cb5863edcb761d2aa2933c3ee0ebec225f7eac8a2a168befa7cbb71b233fbb4d1535ef2b58832d8e80baab385ab223e64cb0572413bb14869f"

RPROVIDES:${PN} += "python3-astunparse \
python3.11dist-astunparse \
python311-astunparse \
python3dist-astunparse"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-wheel"

inherit rpm
