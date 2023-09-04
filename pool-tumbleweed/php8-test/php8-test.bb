SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.9"

RPM_NAME = "php8-test-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "53acbfe8c117ec902f3d44604ca9ffbd14512410602c4700a7d12ce254943af98101baf7ee22ca85271089fd81e611e6178a3ecc1460c4795867efd83a2f0959"

RPROVIDES:${PN} += "php8-test"

RDEPENDS:${PN} += "php-cli"

inherit rpm
