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

RPM_NAME = "python39-PyMeta3-0.5.1-3.18.noarch.rpm"
RPM_HASH = "ff5abcceaacb5593611cb7cc5a0a2c7b5c50225e87202367a09405652fcdf43a6e737d839566be1216f2b2beefbf1098e23d9cccf1851f672d0676df148f7d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pymeta3) \
python39-PyMeta3 \
python3dist(pymeta3)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
