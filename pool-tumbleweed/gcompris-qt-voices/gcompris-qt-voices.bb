SUMMARY = "Voice files for gcompris-qt"
DESCRIPTION = "This is the voice data package for gcompris-qt-voices. This a full bundle for \
when you do not want to use the automatic online feature. \
 \
This allow you to play gcompris-qt-voices activities in different languages."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & CC-BY-SA-1.0+ & GFDL-1.1-or-later & SUSE-Public-Domain & SUSE-Free-Art-1.3"

PV = "3.2~20230329"

RPM_NAME = "gcompris-qt-voices-3.2~20230329-1.1.noarch.rpm"
RPM_HASH = "832ebcf071faa6b1d8a95cd932239e42a0501caf84365e41715233fc20a0eaffa6fa1446adb874f5ed8587fc452778a0581ddbd523ca22ea4a6831734ff38dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-voices \
gcompris-voices \
locale(gcompris:en)"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
