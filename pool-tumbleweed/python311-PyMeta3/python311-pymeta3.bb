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

RPM_NAME = "python311-PyMeta3-0.5.1-3.18.noarch.rpm"
RPM_HASH = "4665f024f74d718aa0b486959f83018ee3fdbe7fae8ff62a956380c17fdbb94057b19e17e5f0d4790af411b802b503b549b5e4712b6a1c7c082c9c8a32e3433a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pymeta3 \
python311-PyMeta3 \
python3dist-pymeta3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
