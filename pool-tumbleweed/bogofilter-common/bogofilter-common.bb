SUMMARY = "Fast Anti-Spam Filtering by Bayesian Statistical Analysis"
DESCRIPTION = "Bogofilter is a Bayesian spam filter.  In normal operation, it takes an \
e-mail message or text from standard input, does a statistical check \
against lists of 'good' and 'bad' words, and returns a status code \
indicating whether the message is spam.  Bogofilter is designed with \
fast algorithms (including the Berkeley DB system), coded directly in \
C, and tuned for speed, so it can be used for production by sites that \
process a lot of mail. \
 \
This package contains shared files for various bogofilter backends"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-common-1.2.4-15.12.noarch.rpm"
RPM_HASH = "dc10523ce345b5c5fcea469ad528edf3934c0159d41866188ef47634feba3206065b06f29b30b62ea8b4e91180468b28afbea1d0fb87a77a9deb7bcfa844e71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bogofilter-common \
config-bogofilter-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bogofilter-backend"

inherit rpm
