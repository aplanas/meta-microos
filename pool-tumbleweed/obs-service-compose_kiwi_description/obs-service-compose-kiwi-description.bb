SUMMARY = "An OBS service: generate KIWI description using KEG"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
The source service produces a KIWI image description through KEG from one or \
more given git repositories that contain keg-recipes source tree. It supports \
auto-generation of change log files from commit history."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "obs-service-compose_kiwi_description-2.1.1-1.1.noarch.rpm"
RPM_HASH = "fca3924cdd39d6fdb62d10a950e316e4ef9d6ea018710cf53ffca28114b90c9e3a0ae59821b5b04b2860ce5ad7cc39c4c40d1757d5d7460f31253c2613493136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-compose-kiwi-description"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
git \
python3-kiwi-keg"

inherit rpm
