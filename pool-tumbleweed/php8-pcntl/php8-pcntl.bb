SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-pcntl-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "1c9ea0348df1991843341f83e8fb445933b515127739afc3e79c08fbc7bc16dcd95c87137ea75f38edae5166dc753cdbc2a3334debde6c10612177021a7a7776"

RPROVIDES:${PN} += "config-php8-pcntl \
php-pcntl \
php8-pcntl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
