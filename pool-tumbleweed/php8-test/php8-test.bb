SUMMARY = "Interpreter for the PHP scripting language version 8"
DESCRIPTION = "Run php upstream testsuite."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.7"

RPM_NAME = "php8-test-8.2.7-1.1.aarch64.rpm"
RPM_HASH = "23f5e511c27dc50703be376a63a5ad06b9e013e154f843a450ee7785f037e287362456f3223439debc1c14bd90aa5e9ece7e17efbd397a9f2f7cfd9a365faa69"

RPROVIDES:${PN} += "php8-test"

RDEPENDS:${PN} += "php-cli"

inherit rpm
