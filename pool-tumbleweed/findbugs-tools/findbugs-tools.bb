SUMMARY = "Addon tools for findbugs"
DESCRIPTION = "This package contains additional tools for use with findbugs.  See \
README.tools for more information."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "findbugs-tools-3.0.1-2.21.noarch.rpm"
RPM_HASH = "5c604b0b43445662a5c4993375533725aecf49031608bbc936aa6dea3f103150bbb483284630cf7a5cdb11a25f8cc87fbd88beab7822e2abc35ce86d57d62eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-tools"

RDEPENDS:${PN} += "findbugs \
junit"

inherit rpm
