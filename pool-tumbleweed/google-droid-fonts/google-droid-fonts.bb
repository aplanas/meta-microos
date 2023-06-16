SUMMARY = "Fonts With Extensive Style and Language Support Developed for Android"
DESCRIPTION = "The Droid family of fonts consists of Droid Sans, Droid Sans Mono and \
Droid Serif. Each contains extensive character set coverage including \
Western Europe, Eastern/Central Europe, Baltic, Cyrillic, Greek and \
Turkish support. The Droid Sans regular font also includes support for \
Simplified and Traditional Chinese, Japanese and Korean support for the \
GB2312, Big 5, JIS 0208 and KSC 5601 character sets respectively. Droid \
was designed by Ascender's Steve Matteson to provide optimal quality \
and comfort on a mobile handset when rendered in application menus, web \
browsers and for other screen text. - Ascender Press Release, \
http://www.ascendercorp.com/pr/2007-11-12/"
LICENSE = "Apache-2.0"

PV = "20121204"

RPM_NAME = "google-droid-fonts-20121204-8.5.noarch.rpm"
RPM_HASH = "1901f037da71e70f2900c7c4d0f415dba4c01fd05b49d899235bad942768a5d441ce12266c9f633f1edb2c9c658ef4edc17e8b0abaa62b9beaeb5d566848c89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "droid-fonts \
google-droid-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
