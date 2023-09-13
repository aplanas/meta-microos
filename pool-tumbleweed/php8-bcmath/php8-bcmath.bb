SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-bcmath-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "ef81c845c71460fb97ff2a211eab71c1af97be7aa9fab72ecae5fb82dc0d88a6013a729f381d4d5b975dbae75b39e318d51a813d530f4fc6fefa278d1759bd0e"

RPROVIDES:${PN} += "config-php8-bcmath \
php-bcmath \
php8-bcmath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
