SUMMARY = "A PHP wrapper for libsmbclient"
DESCRIPTION = "smbclient is a PHP extension that uses Samba's libsmbclient library to provide \
Samba related functions and 'smb' streams to PHP programs."
LICENSE = "PHP-3.01"

PV = "1.1.1"

RPM_NAME = "php8-smbclient-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "ad35fc4edf58ca77223ce6730a1f132e366e0603685260088648e1e9458ee7aa26da8142cc08d3f9f2c9168b2aeeaffda986115183ebe0da7ec8e93c62815cf4"

RPROVIDES:${PN} += "config-php8-smbclient \
php-smbclient \
php8-smbclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
php-api \
php-zend-abi"

inherit rpm
