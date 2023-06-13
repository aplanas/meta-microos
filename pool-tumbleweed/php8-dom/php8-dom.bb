SUMMARY = "Document Object Model extension for PHP"
DESCRIPTION = "This module adds Document Object Model (DOM) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-dom-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "2f3c63e66ebb235c069a80e7fe327769b961304c36083a7afce712823937982e853530613c8145b9f66049fd6448ac41aff2e36b8dc49297900d9e42ec226e35"

RPROVIDES:${PN} += "config(php8-dom) \
php-dom \
php8-dom \
php8-dom(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxml2.so.2()(64bit) \
php"

inherit rpm
