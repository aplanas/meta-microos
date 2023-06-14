SUMMARY = "German<->English word dictionary in DING syntax"
DESCRIPTION = "This package contains the German<->English dictionary/wordlist from \
TU Chemnitz in an easy markup language suitable for use with grep. \
A recommended graphical frontend for using this dictionary is 'ding'."
LICENSE = "GPL-2.0-or-later"

PV = "1.9"

RPM_NAME = "ding-dict-de_en-1.9-2.2.noarch.rpm"
RPM_HASH = "467a6b0d95470f65e7fdff8e4924fc22333f5164aef6794bbf1ab56d8b3f3c404a2b6ecfa582e0fafc7a619b500e6a04982d4c14e0f1ca039b82037606b311b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ding-dict-de-en"

RDEPENDS:${PN} += ""

inherit rpm
