SUMMARY = "System user for the geoclue service"
DESCRIPTION = "System user for use by the geoclue service"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "system-user-srvGeoClue-2.7.0-1.3.noarch.rpm"
RPM_HASH = "1ed06aa430c11cfdfbd10f6d445b906ee214d4b13420cba2b2797c1161a7a2599657e67c9eb1e7806cf648c522ecff534063c27737f5497c6092a4a2f3ff74f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-srvGeoClue \
system-user-srvGeoClue \
user-srvGeoClue"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
