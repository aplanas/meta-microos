SUMMARY = "KDE software to manage office documents in the office"
DESCRIPTION = "Kraft is KDE software to help to create and manage office documents such as \
offers and invoices in the small enterprise. \
 \
It supports easy document creation, templates with calculation, customer management \
through the KDE addressbook, highly configurable PDF output and more. \
 \
See the website http://volle-kraft-voraus.de for more information."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "kraft-1.0-2.1.aarch64.rpm"
RPM_HASH = "6b5d7ae0a213f420e752a3e76df3b13dbec7ce1f13be229ffa5e135cee061d8a932d7403f15b56a4f7a43d6e897597a5e9a60b57e3c6088fc3ed7c3d06c40535"

RPROVIDES:${PN} += "kraft"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libctemplate.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-PyPDF2 \
python3-base \
python3-reportlab \
python3-six"

inherit rpm
