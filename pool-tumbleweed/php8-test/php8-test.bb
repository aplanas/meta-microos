SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.8"

RPM_NAME = "php8-test-8.2.8-1.1.aarch64.rpm"
RPM_HASH = "32636c9075e3b673b58e8795ddb557a69065fb1d4d7933cb8b29fc51a09bd02598b87e49c151d02deb3b7aec773dedfc9bd581d6e1e1d72991fc939d5b4909a2"

RPROVIDES:${PN} += "php8-test"

RDEPENDS:${PN} += "php-cli"

inherit rpm
