SUMMARY = "Translations for package lxqt-openssh-askpass"
DESCRIPTION = "Provides translations for the 'lxqt-openssh-askpass' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-openssh-askpass-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "87a7ac99aa06c9e6b801b1a0f277bf5c5f801d532ca80fa02609af15ca9ba9409b75176f5d74bfe544424216a49fa87723d9c51b0459083bae46ba0a154dbd57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-openssh-askpass-lang \
lxqt-openssh-askpass-lang-all"

RDEPENDS:${PN} += "lxqt-openssh-askpass"

inherit rpm
