SUMMARY = "Git Web Interface"
DESCRIPTION = "CGI script that allows browsing git repositories via web interface. \
 \
The apache2 configuration contained in this package installs a virtual \
directory /git/ that calls the cgi script."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-web-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "b4df7b07b2d9017cf3c5eb7a58c03407f6e23e9eb063a729ec750ff4ba24582eadb1fdc894f2c6a53adbc7a9d4c3a88520bfe497e93227a146e7cce7a06b18b4"

RPROVIDES:${PN} += "config-git-web \
git-web"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
git-core \
perl-CGI \
perl-Git"

inherit rpm
