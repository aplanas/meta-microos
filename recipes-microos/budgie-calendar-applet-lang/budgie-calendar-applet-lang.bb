SUMMARY = "Translations for package budgie-calendar-applet"
DESCRIPTION = "Provides translations for the 'budgie-calendar-applet' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "budgie-calendar-applet-lang-5.2-2.12.noarch.rpm"
RPM_HASH = "cd6c0f1e82a7636239e9b3172a4cea6be760eec830423c0a0f4d5bc732385cd1c2cb52e13f301e79fb0c739a98d8408b9d1ee0797dd4f42b0eee0275d5471bec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-calendar-applet-lang budgie-calendar-applet-lang-all locale(budgie-calendar-applet:ca) locale(budgie-calendar-applet:de) locale(budgie-calendar-applet:el_GR) locale(budgie-calendar-applet:es) locale(budgie-calendar-applet:fr) locale(budgie-calendar-applet:lt) locale(budgie-calendar-applet:pt_PT) locale(budgie-calendar-applet:tr) locale(budgie-calendar-applet:uk)"
RDEPENDS:${PN} += "budgie-calendar-applet"

inherit rpm
