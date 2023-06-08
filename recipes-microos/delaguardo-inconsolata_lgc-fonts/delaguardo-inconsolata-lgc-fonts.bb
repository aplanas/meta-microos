SUMMARY = "Inconsolata font with Cyrillic characters"
DESCRIPTION = "Inconsolata is one of the most suitable font for programmers created by Raph \
Levien. Since the original Inconsolata does not contain Cyrillic alphabet, \
it was slightly inconvenient for not a few programmers from Russia. \
 \
Inconsolata LGC is a modified version of Inconsolata with added the Cyrillic \
alphabet which directly descends from Inconsolata Hellenic supporting modern \
Greek."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "delaguardo-inconsolata_lgc-fonts-1.1.0-5.17.noarch.rpm"
RPM_HASH = "0bd80dc8c42e1f91edde3f1c8cc5cfd85d15fed04eefcb122753f74e4bf6e0a69dd38fc67f5c2ec75a18e81db587650e28422ca2c8078f1221cb690935cb5035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "delaguardo-inconsolata_lgc-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
