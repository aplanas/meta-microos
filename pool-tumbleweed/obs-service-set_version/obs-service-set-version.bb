SUMMARY = "An OBS source service: Update spec file version"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
Very simply script to update the version in .spec or .dsc files according to \
a given version or to the existing files."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "obs-service-set_version-0.6.2-2.1.noarch.rpm"
RPM_HASH = "15f24cc62a683cc13b30fb3e2e890d8c774f6a3de03c94267e88dbd187c7ebdc5839ffb4ffb7bc12a28f34dce18479fa720a4d390b260b0a47832b496d467d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-set_version"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base"

inherit rpm
