SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python311-Markups-3.0.0-3.10.noarch.rpm"
RPM_HASH = "580792cced988f72e4d4038b5003f850578e3e35699172ca052cba3caa67e273db5f6d2754f92929ce651665d81438be032eabf47c8f93b49d8d023416ea8daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Markups \
python3.11dist-markups \
python311-Markups \
python3dist-markups"

RDEPENDS:${PN} += "python-abi \
python311-markdown-math"

inherit rpm
