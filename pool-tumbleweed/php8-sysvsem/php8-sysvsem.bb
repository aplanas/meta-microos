SUMMARY = "SysV Semaphore support for PHP"
DESCRIPTION = "PHP interface for System V semaphores."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-sysvsem-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "a6bcd9b63af6fbbaca08998598cab152c44fb209a6dbec2fa32d28f4f276f187ccfdf460a20ed118c1a7ed92918dbd4ed385d4ba9850e8f27f1e727da638ec1b"

RPROVIDES:${PN} += "config-php8-sysvsem \
php-sysvsem \
php8-sysvsem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
