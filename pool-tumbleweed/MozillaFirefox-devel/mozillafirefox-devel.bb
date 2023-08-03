SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "115.0.3"

RPM_NAME = "MozillaFirefox-devel-115.0.3-1.1.noarch.rpm"
RPM_HASH = "6ab086e90ef9a198b707c5e4e45483396d5e7041602093f6422bd9b14bd15e740d3bf04bbe8353e244d455d8fefa73b021da1b13a421e99efb8806d0200c0f03"
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
