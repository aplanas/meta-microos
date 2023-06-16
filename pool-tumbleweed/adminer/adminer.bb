SUMMARY = "Database management in a single PHP file"
DESCRIPTION = "Adminer (formerly phpMinAdmin) is a full-featured database management tool \
written in PHP. Conversely to phpMyAdmin, it consists of a single file ready to \
deploy to the target server. Adminer is available for MySQL, PostgreSQL, SQLite, \
MS SQL, Oracle, Firebird, SimpleDB, Elasticsearch and MongoDB."
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-4.8.1-1.6.noarch.rpm"
RPM_HASH = "02c86827506efdb77695a19748c0482e251e1165bbbb435a9194e4b38becf96b5e050fd8e0399ce7f17b722fdf1157bfde8a973dcb03cb6eced1c107b917dae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer \
config-adminer"

RDEPENDS:${PN} += "/usr/bin/sh \
adminer-database-support \
mod-php-any \
php-iconv \
php-mbstring \
php-session \
php-zlib"

inherit rpm
