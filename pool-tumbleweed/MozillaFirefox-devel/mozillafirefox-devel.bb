SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "115.0"

RPM_NAME = "MozillaFirefox-devel-115.0-1.1.noarch.rpm"
RPM_HASH = "deddf0a5a197b6a9ee59bbb2fb13fba6f95d8052ffc1c96a835f70851b66f2518f37ee6b04de75ae0ebb1b9c6b941365357fb13daadd45bd506b9b6f14722a56"
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
