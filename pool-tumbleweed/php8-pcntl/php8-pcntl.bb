SUMMARY = "Process Control extension for PHP"
DESCRIPTION = "Process Control support in PHP implements the Unix style of process \
creation, program execution, signal handling and process termination \
(fork, waitpid, signal, WIF flags, etc.)"
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-pcntl-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "71ce6b8fc0481e0b2d5546708547246939c90b796908ecb6644a581aabd8c1f13942bc5332cf7cb7c918d2eecd5f968f18a05e595933829311e0b2e9e3edb653"

RPROVIDES:${PN} += "config-php8-pcntl \
php-pcntl \
php8-pcntl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php"

inherit rpm
