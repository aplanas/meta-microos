SUMMARY = "Translations for package budgie-calendar-applet"
DESCRIPTION = "Provides translations for the 'budgie-calendar-applet' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "budgie-calendar-applet-lang-5.2-2.13.noarch.rpm"
RPM_HASH = "f6552fa47889c84169d37d882aa4538bde888e3ebfc45827cdbf262088573fb8cabdd149ecd8902453fe0da19ee355a6888ac2e27ca9043262c4d056e497f060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-calendar-applet-lang \
budgie-calendar-applet-lang-all \
locale-budgie-calendar-applet-ca \
locale-budgie-calendar-applet-de \
locale-budgie-calendar-applet-el-GR \
locale-budgie-calendar-applet-es \
locale-budgie-calendar-applet-fr \
locale-budgie-calendar-applet-lt \
locale-budgie-calendar-applet-pt-PT \
locale-budgie-calendar-applet-tr \
locale-budgie-calendar-applet-uk"

RDEPENDS:${PN} += "budgie-calendar-applet"

inherit rpm
