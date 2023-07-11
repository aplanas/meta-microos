SUMMARY = "Git Web Interface"
DESCRIPTION = "CGI script that allows browsing git repositories via web interface. \
 \
The apache2 configuration contained in this package installs a virtual \
directory /git/ that calls the cgi script."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-web-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "7ec8c4ed8c503a56774ffe31f38a4188be452c8ce4145486d8d9874e9d91a7093d4a1601ce5f7667dd9cab9c708e498aa6d82dd2299fbab1040776df3e9a0726"

RPROVIDES:${PN} += "config-git-web \
git-web"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
git-core \
perl-CGI \
perl-Git"

inherit rpm
