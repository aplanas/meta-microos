SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python311-Markups-3.0.0-3.8.noarch.rpm"
RPM_HASH = "a29c98ccc5073338fadfad14f551218bcae67bb1df3f45334a952d7f05c5048bcd0242e6f270f730edc5c7bba57307fba42d19907cd7673de204a0d17521844c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-markups \
python311-Markups \
python3dist-markups"

RDEPENDS:${PN} += "python-abi \
python311-markdown-math"

inherit rpm
