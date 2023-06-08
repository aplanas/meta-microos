SUMMARY = "Devel package for Firefox"
DESCRIPTION = "Development files for Firefox to make packaging of addons easier."
LICENSE = "MPL-2.0"

PV = "112.0.2"

RPM_NAME = "MozillaFirefox-devel-112.0.2-2.1.noarch.rpm"
RPM_HASH = "96dd249ad86f945035fd309df644a128ebde43e4220e71c098cf901d75eae8815f5a197c83c7f1cf495bd6128f799385e8c9da973f6cd1e17d387c631805e14f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MozillaFirefox-devel firefox-devel rpm_macro(firefox_appid) rpm_macro(firefox_ext_install) rpm_macro(firefox_extdir) rpm_macro(firefox_mainver) rpm_macro(firefox_major) rpm_macro(firefox_mozillapath) rpm_macro(firefox_pluginsdir) rpm_macro(firefox_version)"
RDEPENDS:${PN} += "/usr/bin/perl MozillaFirefox perl(Archive::Zip) perl(XML::Simple)"

inherit rpm
