SUMMARY = "Smart replacement for plain tuple used in __version__"
DESCRIPTION = "Smart replacement for plain tuple used in __version__. \
 \
* Keep a *single version definition* inside your package or module \
* Get proper versioning of development snapshots coupled with your \
  Version Control System (pluggable support for additional systems \
  available) \
* Produce nice version strings for released files that are compliant \
  with PEP 386 \
* Remain comparable as tuple of integers"
LICENSE = "LGPL-3.0-or-later"

PV = "1.9.1"

RPM_NAME = "python310-versiontools-1.9.1-14.18.noarch.rpm"
RPM_HASH = "494acea9cac3bfb1db8d1437c5585bc1176fc7fc69f27966e09a663ba2e496143c8d8c300a5018c56a559982916bb88884cd943611512b3820725ca780717835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-versiontools \
python310-versiontools \
python3dist-versiontools"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
