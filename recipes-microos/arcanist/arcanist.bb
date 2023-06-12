SUMMARY = "Command-line interface to Phabricator"
DESCRIPTION = "Arcanist is the command-line tool for Phabricator. \
It allows you to interact with Phabricator installs to send code for review, \
download patches, transfer files, view status, make API calls, and various other \
things. \
 \
For more information, visit http://www.phabricator.com/docs/arcanist/"
LICENSE = "Apache-2.0"

PV = "0.0~git.20220517T162014~85c953e"

RPM_NAME = "arcanist-0.0~git.20220517T162014~85c953e-1.2.noarch.rpm"
RPM_HASH = "91bfec331242dc4692e1f5111716cb05cd750875d843ecf64584bd9ff6f197e35996989e1405e30e7d54381f0058dafdf7c7ceca262c92bf3cf54769c3233532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arcanist \
php7-libphutil"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/php8 \
ca-certificates \
php8 \
php8-curl"

inherit rpm
