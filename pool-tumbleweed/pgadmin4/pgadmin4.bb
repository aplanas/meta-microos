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

RPM_NAME = "pgadmin4-4.30-2.10.aarch64.rpm"
RPM_HASH = "dc0c09e18c5e8850775b22a0715567645c11567a9282ccb3c1857e4a7468264579547b7057b808ccf2855f15b40ab7fc1fd497e8aed4f103b2e1f9ec3fe2eda8"

RPROVIDES:${PN} += "config-pgadmin4 \
pgadmin4"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
pgadmin4-web \
python3 \
systemd"

inherit rpm
