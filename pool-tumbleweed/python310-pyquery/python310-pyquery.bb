SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python310-pyquery-2.0.0-3.3.noarch.rpm"
RPM_HASH = "6c2bafda728f682a12a8bb4fcff92d11c9a794f720663666f6cc6c1e0c9d6c7e55adf769bb67ea641f3de4bc64f1d1b38cab7bc71dad4b9d7d17e8e5557463f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyquery \
python310-pyquery \
python3dist-pyquery"

RDEPENDS:${PN} += "python-abi \
python310-cssselect \
python310-lxml"

inherit rpm
