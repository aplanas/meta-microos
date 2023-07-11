SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python311-pyquery-2.0.0-3.3.noarch.rpm"
RPM_HASH = "d87309b1e7d6c07bb5547df87f19cad3b8e9c15d385ed28dc247ea013d592056723f71f6afc460a56478f1d18801aceabd3f6db3866f646eefd94be1f8a4f0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyquery \
python3.11dist-pyquery \
python311-pyquery \
python3dist-pyquery"

RDEPENDS:${PN} += "python-abi \
python311-cssselect \
python311-lxml"

inherit rpm
