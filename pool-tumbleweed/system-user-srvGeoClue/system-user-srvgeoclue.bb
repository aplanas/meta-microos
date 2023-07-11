SUMMARY = "System user for the geoclue service"
DESCRIPTION = "System user for use by the geoclue service"
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "system-user-srvGeoClue-2.7.0-1.4.noarch.rpm"
RPM_HASH = "9d23b4fa1902b4717d3346be93dda717de8b431886605eb3aaef116b43e02e66b97f79d4e660344fe09dfeb54eddf928fa516e39e3dc9f031bc2d989d153aebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-srvGeoClue \
system-user-srvGeoClue \
user-srvGeoClue"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
