SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "116.0.3"

RPM_NAME = "MozillaFirefox-devel-116.0.3-1.1.noarch.rpm"
RPM_HASH = "1b841cb3fc7ae325cb46493dabc5af8080172b3eea3473955cac374de946b2a1ce9edbfa90d94b2f6d5c3808b3a4474bbb0d0e29c016413580e446b033f19089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MozillaFirefox-devel \
firefox-devel \
rpm-macro-firefox-appid \
rpm-macro-firefox-ext-install \
rpm-macro-firefox-extdir \
rpm-macro-firefox-mainver \
rpm-macro-firefox-major \
rpm-macro-firefox-mozillapath \
rpm-macro-firefox-pluginsdir \
rpm-macro-firefox-version"

RDEPENDS:${PN} += "/usr/bin/perl \
MozillaFirefox \
perl-Archive--Zip \
perl-XML--Simple"

inherit rpm
