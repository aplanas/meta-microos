SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "115.0.2"

RPM_NAME = "MozillaFirefox-devel-115.0.2-1.1.noarch.rpm"
RPM_HASH = "28bf884859b1b6d785dd310be531d67d769f7300cc909918ee9c59f31fd5a2a15451c2fd43c641fb22678b5037494131a32392e2bdd4666c2aab37658c125987"
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
