SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-pcntl-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "bc23cb5e973f84c9edc634dd4a7de75871001a4eab3320b9e307acfb9f7b243757ab85d970bf75bacb85ba1111cda8959c3b386f6a18578c9b73c7c04cea7ddd"

RPROVIDES:${PN} += "config-php8-pcntl \
php-pcntl \
php8-pcntl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
