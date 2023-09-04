SUMMARY = "Git Web Interface"
DESCRIPTION = "CGI script that allows browsing git repositories via web interface. \
 \
The apache2 configuration contained in this package installs a virtual \
directory /git/ that calls the cgi script."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-web-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "2ee34f49fc4cd02301d93912301a391c4fdc26cdf00c798eb33f5ddd9592fa9e5e6f738aa652c40055c4c8638c7f623061153f52357d8412d10c033e8cd325d2"

RPROVIDES:${PN} += "config-git-web \
git-web"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
git-core \
perl-CGI \
perl-Git"

inherit rpm
