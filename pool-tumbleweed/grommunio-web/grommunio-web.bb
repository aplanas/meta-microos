SUMMARY = "Web client for access to grommunio features from the web"
DESCRIPTION = "A web client written in PHP that makes use of HTML5, JSON and ExtJS \
to allow users to make full use of the grommunio \
through a web browser."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only & LGPL-2.1-only & MIT"

PV = "3.2.43.7ebf7d9"

RPM_NAME = "grommunio-web-3.2.43.7ebf7d9-1.2.noarch.rpm"
RPM_HASH = "02640d15db37cbb42a00945de534a217eaca9edec0a96908584a14404c35eb6e57717fdd4ccd496e31bbcfb856e1fd896808dafcc54ddcb0a991a1e25e015911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grommunio-web \
grommunio-web"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
gromox \
mapi-header-php \
php8-bcmath \
php8-ctype \
php8-curl \
php8-gd \
php8-gettext \
php8-iconv \
php8-mbstring \
php8-openssl \
php8-sodium \
php8-sqlite \
php8-sysvshm \
php8-zip \
php8-zlib \
user-groweb"

inherit rpm
