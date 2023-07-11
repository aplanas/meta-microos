SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-pygaljs-1.0.2-2.3.noarch.rpm"
RPM_HASH = "2e2b2db812c12ae1167cd396ef9bb8edd55b05fde51e577e647ad0079287c47cff406ef6c5c6ec92229cffed299dd569ae669c49f258c592bf9ee2854e788826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygaljs \
python39-pygaljs \
python3dist-pygaljs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
