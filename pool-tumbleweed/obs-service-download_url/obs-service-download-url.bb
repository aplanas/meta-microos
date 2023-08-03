SUMMARY = "An OBS source service: wget download tool"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading files from given URLs via wget"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "obs-service-download_url-0.2.0-1.1.noarch.rpm"
RPM_HASH = "1cf09319a5ebc2cc5bd25af4d2db2207aa241c64a6e32b5f765f57b35d91f7f74213baf4ef7ba127a544682f2eb7bfc77a340d7fd2572a3729f0e3fb9eb21929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-download-url"

RDEPENDS:${PN} += "/usr/bin/bash \
wget"

inherit rpm
