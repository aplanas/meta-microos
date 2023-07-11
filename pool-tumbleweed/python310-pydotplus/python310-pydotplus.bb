SUMMARY = "Python interface to Graphviz's Dot language"
DESCRIPTION = "PyDotPlus is an improved version of the old pydot project that provides a \
Python Interface to Graphviz's Dot language."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-pydotplus-2.0.2-3.23.noarch.rpm"
RPM_HASH = "22335875e1014456cd117f820f509bd56d4eb0e6d08564c5708e2985d862e42274845146ab4e07ea61eef2841568515e0bcd3204558cc155084e36fb30eacbaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydotplus \
python310-pydotplus \
python3dist-pydotplus"

RDEPENDS:${PN} += "graphviz \
python-abi \
python310-pyparsing"

inherit rpm
