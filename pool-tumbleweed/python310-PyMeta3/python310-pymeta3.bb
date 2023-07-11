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

RPM_NAME = "python310-PyMeta3-0.5.1-3.19.noarch.rpm"
RPM_HASH = "44921a3acbf048324669f46ba1b8c284c9a253c7b334f8380bde8dbac93c7a8a76e1e9786f9f1ec63fc638066213cff1178ccba5a3f6ed70400f2a7b2aecb427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymeta3 \
python310-PyMeta3 \
python3dist-pymeta3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
