SUMMARY = "Configurable talking cow (and some other creatures)"
DESCRIPTION = "cowsay is a configurable talking cow, written in Perl. It operates \
much as the figlet program does, and it written in the same spirit \
of silliness."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "cowsay-3.7.0-1.7.noarch.rpm"
RPM_HASH = "9f71f815fe5daa2fa88a90f502fcd0f50099d7ddd6ac0da82bb9c1ca532335be8c76a4d64824820066cff0486fc476c433e01ed55ce0cd2b6f6903aa514e6b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cowsay perl(Acme::Cow::DragonAndCow) perl(Acme::Cow::Example) perl(Acme::Cow::Frogs) perl(Acme::Cow::MechAndCow) perl(Acme::Cow::Stegosaurus) perl(Acme::Cow::TextBalloon) perl(Acme::Cow::TuxStab)"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
