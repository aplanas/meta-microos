SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python310-Markups-3.0.0-3.8.noarch.rpm"
RPM_HASH = "f1b1297f274dce977c9a641b0af72ade28f286107c74ede8e040f6a863619226f8fae46f324060507f0507ef9cbb7e6d20d948f93854b7ff3311c10a7cda9dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Markups \
python3.10dist-markups \
python310-Markups \
python3dist-markups"

RDEPENDS:${PN} += "python-abi \
python310-markdown-math"

inherit rpm
