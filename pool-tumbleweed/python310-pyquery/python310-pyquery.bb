SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python310-pyquery-2.0.0-3.1.noarch.rpm"
RPM_HASH = "aedaf023c5ded577b642a14d2d4fd21472d5242899d7f053b7fc7540092a8d056058b011fbbb9475f00bf270d9ee50bf3395218b2712f94ba08493ab69871ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyquery \
python3.10dist-pyquery \
python310-pyquery \
python3dist-pyquery"

RDEPENDS:${PN} += "python-abi \
python310-cssselect \
python310-lxml"

inherit rpm
