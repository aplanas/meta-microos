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

RPM_NAME = "python311-versiontools-1.9.1-14.17.noarch.rpm"
RPM_HASH = "3413b749f1cb395756117958dfa7b21f6d09c952ed74caef02c6f06f4f8ade84a3dcd72b1369d2592a2d809ab81f5198114baca639bacd86eb523c4315ae943e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(versiontools) \
python311-versiontools \
python3dist(versiontools)"

RDEPENDS:${PN} += "python(abi) \
python311-setuptools"

inherit rpm
