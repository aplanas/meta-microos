SUMMARY = "Service for substituting various variables in build recipes"
DESCRIPTION = "This service can be used during buildtime to gain access to various variables \
in build recipes."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "obs-service-kiwi_metainfo_helper-0.6-2.2.noarch.rpm"
RPM_HASH = "b20c5e3ebcac15d7e3d40ac62a32ae380fc4fb3f51c0631bdfe6d007c3398db56c9a4378bd922c0cc06a996d718d868be96a0a4cb107ee65098a2ce263d8a6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-kiwi_metainfo_helper"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/find \
/usr/bin/grep \
/usr/bin/sed"

inherit rpm
