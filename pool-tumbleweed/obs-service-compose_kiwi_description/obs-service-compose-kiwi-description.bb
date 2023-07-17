SUMMARY = "An OBS service: generate KIWI description using KEG"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
The source service produces a KIWI image description through KEG from one or \
more given git repositories that contain keg-recipes source tree. It supports \
auto-generation of change log files from commit history."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "obs-service-compose_kiwi_description-2.1.0-1.1.noarch.rpm"
RPM_HASH = "0b822888a25156d1a5260333c31c573fbfd2e678bab1b99de18f72514e7949c093cb950d221915bdd12fadc9530f7f9f8584d356cc463c8758ca9f0931d645a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-compose-kiwi-description"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
git \
python3-kiwi-keg"

inherit rpm
