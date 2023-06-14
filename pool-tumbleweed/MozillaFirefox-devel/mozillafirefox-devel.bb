SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "113.0.2"

RPM_NAME = "MozillaFirefox-devel-113.0.2-1.1.noarch.rpm"
RPM_HASH = "8ca61a09b54f8a7b0d506a812d68d7917d72b02b7889729735101f0dfa0aef933993cb3c5071dda756b4662b14881651042ff37891cd73a3c073fc9ad755420d"
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
