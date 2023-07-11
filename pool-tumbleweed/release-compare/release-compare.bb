SUMMARY = "Release Compare Script"
DESCRIPTION = "This package contains scripts to create changelog files relative \
to last released result. \
 \
Note: you need to use a releasetarget definition in your OBS repository \
      to get this working. And the release target needs to have published binaries."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "release-compare-0.9.1-1.1.noarch.rpm"
RPM_HASH = "e431f426369db965601d620aff2141ba3779add7574cad66fcde5f8d3f72f9ac2f799897202c517c89a176ba04e0dfbc0db3c3a4090634be00195e33c37990cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "release-compare"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-PyYAML \
python3-setuptools"

inherit rpm
