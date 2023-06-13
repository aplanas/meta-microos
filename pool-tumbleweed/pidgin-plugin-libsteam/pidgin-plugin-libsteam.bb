SUMMARY = "Steam plugin for Pidgin"
DESCRIPTION = "Adds support for Steam to Pidgin, Adium, Finch and other libpurple \
based messengers. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-3.0+"

PV = "1.6.1"

RPM_NAME = "pidgin-plugin-libsteam-1.6.1-2.27.noarch.rpm"
RPM_HASH = "5b372531b2674392e3905fd285a03e324dbbefa8087363445eeb0907a73d72f7d0873bb58c163ddaab24576d27711f9cd8fe82f5e5b59b6c78e05a6dcd2c8d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-libsteam \
pidgin-plugin-libsteam"

RDEPENDS:${PN} += "libpurple-plugin-libsteam"

inherit rpm
