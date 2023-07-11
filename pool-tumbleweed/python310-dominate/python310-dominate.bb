SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.8.0"

RPM_NAME = "python310-dominate-2.8.0-1.3.noarch.rpm"
RPM_HASH = "6236064420135a190d2dafc6494eeadf4d5513f8fc86f061134d094c573af579c3b7f8789b49c2dfdfca6f5dd5cb6073a67389bfe71c4c9766650d0a5703aa86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dominate \
python310-dominate \
python3dist-dominate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
