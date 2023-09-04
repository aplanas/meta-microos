SUMMARY = "Management tool for PostgreSQL"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. It is written as a web application in Python, \
using jQuery and Bootstrap for the client side processing and UI. On \
the server side, Flask is being utilised. \
 \
This variant is a Qt-based runtime application intended to allow the \
standalone use on a workstation - it is essentially a browser and \
Python interpretor in one package which will be capable of hosting \
the Python application and presenting it to the user as a desktop \
application."
LICENSE = "PostgreSQL"

PV = "7.6"

RPM_NAME = "pgadmin4-7.6-1.1.noarch.rpm"
RPM_HASH = "222d99dc723485dade15c5b69bd1e3b117fa172e444cb79db6412c183307bbaa277b1854a9e4c56adc72f0ec02adf7bde098abdbb07d3c129ef0574c2d759384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pgadmin4 \
pgadmin4"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
pgadmin4-web \
python3 \
systemd"

inherit rpm
