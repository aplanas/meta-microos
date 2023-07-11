SUMMARY = "A wrapper around various text markups"
DESCRIPTION = "This module provides a wrapper around the various text markup languages, \
such as Markdown and reStructuredText (these two are supported by default)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python310-Markups-3.0.0-3.10.noarch.rpm"
RPM_HASH = "3a8e891aa249b152011df3f705d9583b6158d095fed781c238a46b6111dece81154db8f522dbb38141f06ce9552041f98ab13f86210568dd231a00c50625a375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-markups \
python310-Markups \
python3dist-markups"

RDEPENDS:${PN} += "python-abi \
python310-markdown-math"

inherit rpm
