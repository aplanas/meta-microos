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

RPM_NAME = "python39-versiontools-1.9.1-14.18.noarch.rpm"
RPM_HASH = "2c77083f9349357bf390f24110f26a1891d4ce817e0939fdfad4b0e9390d955d2ea31226a996c27d8d581aa29cf61d68fbe29a7a43e01bbde9d5284e8e880010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-versiontools \
python39-versiontools \
python3dist-versiontools"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
