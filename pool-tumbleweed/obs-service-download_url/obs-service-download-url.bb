SUMMARY = "An OBS source service: wget download tool"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading files from given URLs via wget"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "obs-service-download_url-0.1.3-2.6.noarch.rpm"
RPM_HASH = "00af842d1de517e557e4ab7b90156032ce613e79f7a3cb700906c8df985667f8f783912690d85df778bae3bfa1b8cf8d423c67aedf13d0f11df81fe74c907c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-download-url"

RDEPENDS:${PN} += "/usr/bin/bash \
wget"

inherit rpm
