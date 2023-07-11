SUMMARY = "PSR Extension Module"
DESCRIPTION = "This extension provides the accepted PSR interfaces, so they can be used in an extension."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "php8-psr-1.2.0-2.6.aarch64.rpm"
RPM_HASH = "e2227fb4d150bb73692f90d5e171817f8f0fb56b696892eff219ecfd6f71de9dddf966127d129668b3ad353d12d2e1cf4507f19f8a8e3a668a43abde292116e6"

RPROVIDES:${PN} += "config-php8-psr \
php8-psr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
php-api \
php-zend-abi"

inherit rpm
