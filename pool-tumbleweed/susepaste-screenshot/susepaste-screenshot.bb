SUMMARY = "Script for pasting screenshots"
DESCRIPTION = "A script for using the openSUSE paste service. \
You can paste screenshot of the window or whole desktop."
LICENSE = "GPL-3.0-only"

PV = "0.6"

RPM_NAME = "susepaste-screenshot-0.6-6.2.noarch.rpm"
RPM_HASH = "668c9a3fff87eb6021cbb6fe75cd9e7458536a56d8b04b75f7eb8031335e98ab8301bc2308ce287d307c3cbe4de9a653d1712affb56e9075718990e22b67998f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "susepaste-screenshot"

RDEPENDS:${PN} += "/usr/bin/sh \
ImageMagick \
curl \
wmctrl"

inherit rpm
