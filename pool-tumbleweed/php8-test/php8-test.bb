SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-test-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "1d6889105bc843dd461b51003eb43778a7db8f48db0fbab425f48be1262320ead2d626af3017c9a1aa5113c26b95854d8e7fc04a5b5bdc461a5ff0a9bfe164cd"

RPROVIDES:${PN} += "php8-test"

RDEPENDS:${PN} += "php-cli"

inherit rpm
