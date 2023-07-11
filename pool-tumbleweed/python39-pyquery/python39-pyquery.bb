SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python39-pyquery-2.0.0-3.3.noarch.rpm"
RPM_HASH = "e6b38afc6584e7d8e1d7925c72768acb23788544effba4d1a85079df99e382469fb394e426bda35d8aacbc16dbac75a8b917cde3a5baa6a6bed18e155330aebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyquery \
python39-pyquery \
python3dist-pyquery"

RDEPENDS:${PN} += "python-abi \
python39-cssselect \
python39-lxml"

inherit rpm
