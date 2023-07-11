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

RPM_NAME = "python311-PyMeta3-0.5.1-3.19.noarch.rpm"
RPM_HASH = "f23e78914df379f5a23b4e37de4a74acdc2a5f7125ef2e2b04b5e958e7ad09b733388e7706d9f4911868d3efcbdced6207b9619e19d03386f38faa83f9503213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMeta3 \
python3.11dist-pymeta3 \
python311-PyMeta3 \
python3dist-pymeta3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
