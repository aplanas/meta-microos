SUMMARY = "An OBS service: generate KIWI description using KEG"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
The source service produces a KIWI image description through KEG from one or \
more given git repositories that contain keg-recipes source tree. It supports \
auto-generation of change log files from commit history."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "obs-service-compose_kiwi_description-2.0.3-1.1.noarch.rpm"
RPM_HASH = "e73ed4303f380902e6384480860ad9e6b90bab542b50f6df3c88b9a7ac23dd8ffad461b37cde4e8b2db13322a326430f162c861682df612b3b3b20fb54262712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-compose-kiwi-description"

RDEPENDS:${PN} += "/usr/bin/python3 \
git \
python3-kiwi-keg"

inherit rpm
