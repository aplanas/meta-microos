SUMMARY = "Git Web Interface"
DESCRIPTION = "CGI script that allows browsing git repositories via web interface. \
 \
The apache2 configuration contained in this package installs a virtual \
directory /git/ that calls the cgi script."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-web-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "10dce394bf861f836f0f2d276a15f947372b400547268c2eb1cbfdfa0fd2b405c0517c26e866269bdfe4c9092d2a3a82dcfcbcab57cef457f361d1f40de033ca"

RPROVIDES:${PN} += "config(git-web) \
git-web \
git-web(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
git-core \
perl-CGI \
perl-Git"

inherit rpm
