SUMMARY = "Data files for the JAG game"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game. \
 \
Data files (bonus, help, lang, levels, schemes, sounds, tools) for JAG."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-data-0.3.8-2.12.noarch.rpm"
RPM_HASH = "30d142bb7cda9dfd0e509f21c5a16da6d4e37af3e4c97beaac4d7accabf6507491e35ab7680995c5ac5b749afe76e84aef379f79b16ee32f1f1802b2b1b51936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jag-data"

RDEPENDS:${PN} += "jag"

inherit rpm
