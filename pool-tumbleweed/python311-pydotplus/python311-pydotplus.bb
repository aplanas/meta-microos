SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-pydotplus-2.0.2-3.23.noarch.rpm"
RPM_HASH = "a56c8b86864ea287b497a8978e4a6894b87fe5bdf92547c3e02924eed0e95d06a04eac0a4ad0ea7d675e7e650b9ecfc957097074dbfefef8b92512d420d784b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydotplus \
python3.11dist-pydotplus \
python311-pydotplus \
python3dist-pydotplus"

RDEPENDS:${PN} += "graphviz \
python-abi \
python311-pyparsing"

inherit rpm
