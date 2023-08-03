SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-pcntl-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "ffe0fecfc6aff9c85a918a695d752c9a9be362297177fb18a393e0945484026ebf466d62f1126fc7de3cb1b49de4c489209e443fb39fd713b7e3bfe053eef656"

RPROVIDES:${PN} += "config-php8-pcntl \
php-pcntl \
php8-pcntl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
