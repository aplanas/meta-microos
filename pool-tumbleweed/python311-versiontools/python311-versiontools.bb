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

RPM_NAME = "python311-versiontools-1.9.1-14.18.noarch.rpm"
RPM_HASH = "432c693ac69105d847a807f8aaa8d63757f30ca160aec1600caa25c0adb64c2d751ab68818e5c5f38157df2d5621a6b6c3a3704a11d6efdf4946c9e09cac2a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versiontools \
python3.11dist-versiontools \
python311-versiontools \
python3dist-versiontools"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
