SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-pcntl-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "8dc6be56d9c864079b4b8babdc273c500ac2b4f36d3c27e5754bd6c3069e2866267ecc6856d5e325d53ab252da8671158917d1c186c0d2303e192945454e5a19"

RPROVIDES:${PN} += "config-php8-pcntl \
php-pcntl \
php8-pcntl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
