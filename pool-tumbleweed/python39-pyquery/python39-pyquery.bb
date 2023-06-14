SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python39-pyquery-2.0.0-3.1.noarch.rpm"
RPM_HASH = "f0d59e8ff7c9fa7a104be1157e79038dbc0528a42b7388b37d04a8d67905916783ed69310659f00b7e30bcb52e2ddd7e8772892b44a72b5c710f9f546c7b73ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyquery \
python39-pyquery \
python3dist-pyquery"

RDEPENDS:${PN} += "python-abi \
python39-cssselect \
python39-lxml"

inherit rpm
