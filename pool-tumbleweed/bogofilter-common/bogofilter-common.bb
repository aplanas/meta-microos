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

RPM_NAME = "bogofilter-common-1.2.4-15.13.noarch.rpm"
RPM_HASH = "a25a93d01175f8caa0409045a5e5e9684fefcd50719ae19f6a506038690cc6eb068ae62d8cbf5f00de40b1856b91ad62daf6f1b7e2506e651d1fa68971ba5fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bogofilter-common \
config-bogofilter-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bogofilter-backend"

inherit rpm
