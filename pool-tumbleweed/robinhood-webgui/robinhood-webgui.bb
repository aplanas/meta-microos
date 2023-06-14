SUMMARY = "Web interface to vizualize filesystems stats"
DESCRIPTION = "Web interface to vizualize filesystems stats. This uses robinhood database \
to display miscelancous user and group stats."
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-webgui-3.1.7-2.1.aarch64.rpm"
RPM_HASH = "8eb9490e633e159bc8882b3570f5d8b3fb00e5ab5e5d2a4eae1ddbd92f9a5f858622d0b9019de09f4007bf7ef53e3d2ea7734d92a1a336b28099bf095ee7b777"

RPROVIDES:${PN} += "config-robinhood-webgui \
robinhood-webgui"

RDEPENDS:${PN} += "apache2 \
mod-php-any \
php \
php-mysql \
php-pdo"

inherit rpm
