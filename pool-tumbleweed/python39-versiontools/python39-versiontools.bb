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

RPM_NAME = "python39-versiontools-1.9.1-14.17.noarch.rpm"
RPM_HASH = "3943cdd010d76280d8e8c75a9a31efc5ab25de99fe4d9530c2f1ce9a7e76563c722e18cbe7506078f584009772e31606986defabb35e9068cfd7535b0d1afb83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-versiontools \
python39-versiontools \
python3dist-versiontools"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
