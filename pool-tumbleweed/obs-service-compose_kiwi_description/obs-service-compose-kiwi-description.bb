SUMMARY = "An OBS service: generate KIWI description using KEG"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
The source service produces a KIWI image description through KEG from one or \
more given git repositories that contain keg-recipes source tree. It supports \
auto-generation of change log files from commit history."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "obs-service-compose_kiwi_description-2.0.3-1.2.noarch.rpm"
RPM_HASH = "496b1e770aefee234e3a1a4e54ed04385a2839ca1e4e0eef4e5509aa26dfc1837a6ce789895bd8c28c980589b188bfaba4f4a792d97ea5bb5b6f876d304ecd92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-compose-kiwi-description"

RDEPENDS:${PN} += "/usr/bin/python3 \
git \
python3-kiwi-keg"

inherit rpm
