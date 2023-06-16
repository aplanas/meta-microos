SUMMARY = "Secure Firefox profile for anonymous web browsing"
DESCRIPTION = "JonDoFox is a profile for the Mozilla Firefox web browser or \
Firefox ESR (recommended), particularly optimized for anonymous \
and secure web surfing. For anonymous surfing you need an \
IP changer proxy too. We recommend our proxy tool JonDo. \
 \
By default JonDoFox uses restrictive settings for security reasons. \
Time by time a website does not work like expected. You may have \
a look at our online help for JonDoFox to learn how to deal with \
restrictions. \
 \
This package contains an secure browser profil for anonymous web browsing. \
 \
 \
Adjust when needed than user JonDoFox and rename profile to use JonDoFox name \
 \
mv ~/.mozilla/firefox/profile ~/.mozilla/firefox/JonDoFox \
 \
sed -i 's|Path=profile|Path=JonDoFox|' ~/.mozilla/firefox/profiles.ini"
LICENSE = "GPL-3.0+"

PV = "2.15.0"

RPM_NAME = "jondofox-2.15.0-1.19.noarch.rpm"
RPM_HASH = "5f3dc09d8a948a8279e82b70fddb71f2bfc03a908a640c90d7bba3d720a8e6047b449c6606647a34569e60ca83c23f4abf6568adc4d82b3892157422c016751a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jondofox"

RDEPENDS:${PN} += "/usr/bin/bash \
firefox"

inherit rpm
