SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python39-Markups-3.0.0-3.8.noarch.rpm"
RPM_HASH = "cd52accec84c252b271f407ef85851c70868cd6fb41eb08806e09f0f09c6e976a288ff7b1c3daf503b675a80225448f51e83a54f817eafe0390f47e79b6c26e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(markups) \
python39-Markups \
python3dist(markups)"
RDEPENDS:${PN} += "python(abi) \
python39-markdown-math"

inherit rpm
