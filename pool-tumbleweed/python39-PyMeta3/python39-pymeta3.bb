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

RPM_NAME = "python39-PyMeta3-0.5.1-3.19.noarch.rpm"
RPM_HASH = "2e0d46f602bda3454c6cb87512100ecf3080f5f91247022a8487c587d820ea8e75011e24f585670a85c51d49c783191fda0236ea5226a57225ef79575a81b5d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymeta3 \
python39-PyMeta3 \
python3dist-pymeta3"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
