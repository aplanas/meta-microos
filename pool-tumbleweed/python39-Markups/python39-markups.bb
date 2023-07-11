SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python39-Markups-3.0.0-3.10.noarch.rpm"
RPM_HASH = "383bd8c6f9f26974bbcc22aebed7a58f35a8a15ebe07fedad4872f39d811230633a2de84fb37d990b747ec5b61a0cbc981ba01a750091832d3ae06c28d05d9d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-markups \
python39-Markups \
python3dist-markups"

RDEPENDS:${PN} += "python-abi \
python39-markdown-math"

inherit rpm
