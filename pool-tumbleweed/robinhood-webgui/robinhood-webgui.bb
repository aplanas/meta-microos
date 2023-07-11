SUMMARY = "Web interface to vizualize filesystems stats"
DESCRIPTION = "Web interface to vizualize filesystems stats. This uses robinhood database \
to display miscelancous user and group stats."
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-webgui-3.1.7-2.2.aarch64.rpm"
RPM_HASH = "0559e8381c0f5cd1289d1cffdad97c104bc9387933a0dcbe41c208692b5dbc03e69c39f46d56a7e20c3acdfbe39c0467c1cede6bf349e3ec0dfde6a7ec93ff8e"

RPROVIDES:${PN} += "config-robinhood-webgui \
robinhood-webgui"

RDEPENDS:${PN} += "apache2 \
mod-php-any \
php \
php-mysql \
php-pdo"

inherit rpm
