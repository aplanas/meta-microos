SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-uk-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "3bfad3cb6e984438781dda514f31ab6c30e8042e5bd7f227e52d8cf61f571a9aba56b6eac9dc9fc5161fd14ddfb390b30208971ba6804d8193c45c593f909cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
