SUMMARY = "An OpenTTD Music set"
DESCRIPTION = "OpenMSX is a base music set for OpenTTD."
LICENSE = "GPL-2.0-only"

PV = "0.4.2"

RPM_NAME = "openttd-openmsx-0.4.2-3.2.noarch.rpm"
RPM_HASH = "6a1ec85f7b5432a39c9970f01ebddcbdf88ca39f67a7383dabad0275aab0a9b7a5143aa4c3b9965eef095174fe448552700dc011715666efecb6b8238d0189f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openttd-openmsx"
RDEPENDS:${PN} += "openttd-data"

inherit rpm
