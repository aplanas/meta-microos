SUMMARY = "Testing framework for PHP"
DESCRIPTION = "PHPUnit is a programmer-oriented testing framework for PHP. It is an instance of the xUnit architecture for unit testing frameworks."
LICENSE = "BSD-2-Clause"

PV = "9.5.28"

RPM_NAME = "php8-phpunit-9.5.28-1.2.noarch.rpm"
RPM_HASH = "6c0c197cd7d0cfb28a77a1654d276d71c4f6f678fecbfe3f44c7e18a62e05ce642cfbe7e7cc18f2901ca7eff23579d644908fd35859d4c1f7c4daae4a30f24bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-phpunit \
php8-phpunit \
rpm_macro(php_cs_fixer_rules)"

RDEPENDS:${PN} += "php-dom \
php-json \
php-phar \
php8"

inherit rpm
