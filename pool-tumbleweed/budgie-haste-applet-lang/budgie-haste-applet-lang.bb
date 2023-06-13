SUMMARY = "Translations for package budgie-haste-applet"
DESCRIPTION = "Provides translations for the 'budgie-haste-applet' package."
LICENSE = "GPL-2.0-or-later"

PV = "20200228"

RPM_NAME = "budgie-haste-applet-lang-20200228-2.7.noarch.rpm"
RPM_HASH = "d08ca9e1ff8ccbdbfeb9541727e3ab942012d63281be1ea454371edcfee15f984cef178939360170aed8733f97b118de12b8c4bf7469c48b0cce4fa3956b11f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-haste-applet-lang \
budgie-haste-applet-lang-all \
locale(budgie-haste-applet:ca) \
locale(budgie-haste-applet:da) \
locale(budgie-haste-applet:de) \
locale(budgie-haste-applet:lt) \
locale(budgie-haste-applet:nl_BE)"

RDEPENDS:${PN} += "budgie-haste-applet"

inherit rpm
