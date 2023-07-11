SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-pydotplus-2.0.2-3.23.noarch.rpm"
RPM_HASH = "945bb1e1b7d37198794826104d2c3d44d6005ec6ddb1f942b1f56bd62bb8e0977ce381a2504c311ef0071538c9cbb4fbcbcc6a4c2233e878f02b85cad9a7e6fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydotplus \
python39-pydotplus \
python3dist-pydotplus"

RDEPENDS:${PN} += "graphviz \
python-abi \
python39-pyparsing"

inherit rpm
