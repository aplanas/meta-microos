SUMMARY = "A PHP wrapper for libsmbclient"
DESCRIPTION = "smbclient is a PHP extension that uses Samba's libsmbclient library to provide \
Samba related functions and 'smb' streams to PHP programs."
LICENSE = "PHP-3.01"

PV = "1.1.1"

RPM_NAME = "php8-smbclient-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "8d0d65b079147eb742b9b242af483e9d129fc366a2a788d81ace26ce97e7f879b344797842172c0d552f6e28fb23b84fc186d9e6c09d1ef033dab76e84fc7d61"

RPROVIDES:${PN} += "config-php8-smbclient \
php-smbclient \
php8-smbclient"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
php-api \
php-zend-abi"

inherit rpm
