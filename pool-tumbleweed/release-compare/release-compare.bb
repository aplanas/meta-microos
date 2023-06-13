SUMMARY = "Release Compare Script"
DESCRIPTION = "This package contains scripts to create changelog files relative \
to last released result. \
 \
Note: you need to use a releasetarget definition in your OBS repository \
      to get this working. And the release target needs to have published binaries."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "release-compare-0.9.0-1.1.noarch.rpm"
RPM_HASH = "f2a5b89da18be4e68477f00e800c2bb53fdc4f85c7386f33331c542a13f8d46d68ff5a725c152930461d589450f4fbf0666e4d087b2d9b13dd1a93aae3b0d57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "release-compare"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-PyYAML"

inherit rpm
