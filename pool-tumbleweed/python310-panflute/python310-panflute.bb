SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python310-panflute-2.3.0-1.2.noarch.rpm"
RPM_HASH = "ab5c5bd89c34e17c7985aa9ee5cf663fa0f6e5797b825dcd99647f786a3ed43687b12768d9f3503ce22beec4f74b50c93e1cc4ed656e558eda2a30acc6efb772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-panflute \
python310-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-click \
python310-future \
update-alternatives"

inherit rpm
