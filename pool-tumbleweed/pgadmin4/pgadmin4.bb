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

PV = "4.30"

RPM_NAME = "pgadmin4-4.30-2.12.aarch64.rpm"
RPM_HASH = "2113c1390781539773a8ba28d2805c7fa54d20b2a10bb228d32d52cb3cec5ecac45c0abcc8c0c7c10a5b87627426730fdbe810437ca1682058fb7b6eaa01e867"

RPROVIDES:${PN} += "config-pgadmin4 \
pgadmin4"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
pgadmin4-web \
python3 \
systemd"

inherit rpm
