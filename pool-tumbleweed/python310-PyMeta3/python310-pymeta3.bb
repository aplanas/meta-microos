SUMMARY = "Pattern-matching language based on OMeta for Python 3 and 2"
DESCRIPTION = "PyMeta is an implementation of OMeta, an object-oriented pattern-matching \
language developed by Alessandro Warth \
(http://www.cs.ucla.edu/~awarth/ometa/). PyMeta provides a compact syntax based \
on Parsing Expression Grammars (PEGs) for common lexing, parsing and \
tree-transforming activities in a way that's easy to reason about for Python \
programmers. \
 \
It is a fork of PyMeta 0.5.0 that supports Python 2 and 3."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-PyMeta3-0.5.1-3.18.noarch.rpm"
RPM_HASH = "ff7930906aa086692f1125871be4f1c82fb759e8e3ca7b7ce3b62703a4a6ad09c4720e7ab7ed7e3cc951a4b920cfe3a826b318111ee060ab35cad4c3a9dfadda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMeta3 \
python3.10dist-pymeta3 \
python310-PyMeta3 \
python3dist-pymeta3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
