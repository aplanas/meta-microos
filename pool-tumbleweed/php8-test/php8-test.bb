SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-test-8.2.10-1.1.aarch64.rpm"
RPM_HASH = "d1ddb246de71d5f03c3420ef797ad3145d782cb4abd030255eb1750f1e2d735358e9ef92a60332a9be8c905aef5f266c26d27c924691b87311e07e1410cef382"

RPROVIDES:${PN} += "php8-test"

RDEPENDS:${PN} += "php-cli"

inherit rpm
