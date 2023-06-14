SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.8.0"

RPM_NAME = "python39-dominate-2.8.0-1.1.noarch.rpm"
RPM_HASH = "6f01b2444a5c82df0ff0cac35d6b288575d09eaa964c8eae5a8a61c90312faafe7cdfd5cc909d8a1ac7d6ae825edb862fbe4518535042c32184c599b77a6521a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dominate \
python39-dominate \
python3dist-dominate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
