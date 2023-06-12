SUMMARY = "Translations for package spice-gtk"
DESCRIPTION = "Provides translations for the 'spice-gtk' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "spice-gtk-lang-0.42-1.3.noarch.rpm"
RPM_HASH = "16a9f37755f110b52876e0ad2a9c9de647127d8a7b7385b562d9f238528606f7032e8aae2e3a5fecc30c9df4734ec8dbfba9f0c53e1c3313fa00a9f6e6317941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(spice-gtk:cs) \
locale(spice-gtk:de) \
locale(spice-gtk:fr) \
locale(spice-gtk:it) \
locale(spice-gtk:ka) \
locale(spice-gtk:ru) \
spice-gtk-lang \
spice-gtk-lang-all"
RDEPENDS:${PN} += "spice-gtk"

inherit rpm
