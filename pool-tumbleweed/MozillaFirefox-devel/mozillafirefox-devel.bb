SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "115.0.1"

RPM_NAME = "MozillaFirefox-devel-115.0.1-1.1.noarch.rpm"
RPM_HASH = "76620e2c64e4c2c0a99aa2452ab6e92310b49384dd3f2f8c57280bbffa14b4463675f0528ced9eb14fca017d03a53f294759623d5eb75e0c8aa7125563cec992"
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
