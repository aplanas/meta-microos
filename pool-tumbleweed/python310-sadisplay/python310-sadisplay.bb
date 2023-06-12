SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python310-sadisplay-0.4.9-2.17.noarch.rpm"
RPM_HASH = "637b4bce0e591edc467fa5604648c77b9351f9348098fabfe39b09ca9461542dfb0d19170cc5cdc1405bd7515a32b023f97d6b5d205fa9c17a1781e382639355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sadisplay \
python3.10dist(sadisplay) \
python310-sadisplay \
python3dist(sadisplay)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-SQLAlchemy \
update-alternatives"

inherit rpm
