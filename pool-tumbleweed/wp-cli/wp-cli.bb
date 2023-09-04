SUMMARY = "WordPress command-line interface"
DESCRIPTION = "WP-CLI is the command-line interface for WordPress. You can update plugins, \
configure multisite installations and much more, without using a web browser."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "wp-cli-2.8.1-1.1.noarch.rpm"
RPM_HASH = "0cc554106d70934904aba0382c39515ff6990541e58724d779c5e5a7a511e91dcc682747ef64981e6b437c6996ddaccd0e275e991d41ee25e6e5de8e7bc1f807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-wp-cli \
wp-cli"

RDEPENDS:${PN} += "php \
php-json \
php-openssl \
php-phar \
php-zip"

inherit rpm
