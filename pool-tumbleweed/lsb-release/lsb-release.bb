SUMMARY = "Linux Standard Base Release Tools"
DESCRIPTION = "Tools from the Linux Standard Base project to determine the used distribution"
LICENSE = "GPL-2.0-or-later"

PV = "3.2"

RPM_NAME = "lsb-release-3.2-1.5.noarch.rpm"
RPM_HASH = "747b97d7d35e67991a8d59faa788ffc9b924de7e50336950e91cc28668df5a8f570e4fce1ada3dc6cac2ce8395866cf84f01d0bc6ebf3c5f98dc1ee10455a595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsb-release"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
