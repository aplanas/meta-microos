SUMMARY = "KDE PIM Libraries for Akonadi Contacts"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-contact-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e7a88d3d143461334aa6a1565570ec61709f542fddbadc43d91e86443d9620a410085783959eebc2b71ca9638216bf6fc2abdc1a72b9967ff1150c3159c87ab3"

RPROVIDES:${PN} += "akonadi-contact \
akonadi-contacts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiContact5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5ContactEditor.so.5 \
libKPim5ContactEditor5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
