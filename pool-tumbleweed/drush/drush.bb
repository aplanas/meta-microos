SUMMARY = "Command line shell and scripting interface for Drupal"
DESCRIPTION = "Drush is a command line shell and scripting interface for Drupal, a veritable \
Swiss Army knife designed to make life easier for those of us who spend some of \
our working hours hacking away at the command prompt."
LICENSE = "GPL-2.0-or-later"

PV = "8.3.2"

RPM_NAME = "drush-8.3.2-1.10.noarch.rpm"
RPM_HASH = "a6b08522b35457e9967cae17fba33f8b8ee9284088e8f5af0e3d0ef6a51c043c5d98407976d6f239dc87f7fc76acc4221d379af4eada406dd4dd42019ad17071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drush \
drush_make"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/env \
php \
php-ctype \
php-iconv \
php-json \
which"

inherit rpm
