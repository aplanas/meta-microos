SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-test-8.1.19-2.1.aarch64.rpm"
RPM_HASH = "6e14f91af70c5a4f72c836bf0417d46ff9ab4731e2188f4657e0cac9d55c9b7404a4136f8eb901ddf9418e854974c2ab93dd607a51ddacd8661e2f1932c5b5d6"

RPROVIDES:${PN} += "php8-test \
php8-test(aarch-64)"

RDEPENDS:${PN} += "php-cli"

inherit rpm
