SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-pydotplus-2.0.2-3.22.noarch.rpm"
RPM_HASH = "e32d8c4bd1ae60d7e25e01c2fbeb6b0622a724824dac5e0466ba80cc3741f168765f493b1d4c5b0eca4681526ebed6cf16e863929d9302c6359d19a601402721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydotplus) \
python311-pydotplus \
python3dist(pydotplus)"

RDEPENDS:${PN} += "graphviz \
python(abi) \
python311-pyparsing"

inherit rpm
