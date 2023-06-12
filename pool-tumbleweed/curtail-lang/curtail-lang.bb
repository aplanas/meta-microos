SUMMARY = "Translations for package curtail"
DESCRIPTION = "Provides translations for the 'curtail' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "curtail-lang-1.7.0-1.1.noarch.rpm"
RPM_HASH = "93dd0e20b98d855e19c667e18c421cf3b716e42a58a8deff978e8ee8404c79682b00b3eb74712e7648544e4ff34f0c96cf668cfbd517cae3cb0df7c8917d8370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "curtail-lang \
curtail-lang-all \
locale(curtail:cs) \
locale(curtail:de) \
locale(curtail:es) \
locale(curtail:fr) \
locale(curtail:gl) \
locale(curtail:hr) \
locale(curtail:it) \
locale(curtail:ko) \
locale(curtail:nl) \
locale(curtail:oc) \
locale(curtail:pl) \
locale(curtail:pt_BR) \
locale(curtail:ru) \
locale(curtail:sk) \
locale(curtail:sv) \
locale(curtail:tr)"
RDEPENDS:${PN} += "curtail"

inherit rpm
