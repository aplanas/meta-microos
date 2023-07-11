SUMMARY = "KDE PIM Libraries for Akonadi Contacts"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-contact-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "90053a235e1bba5bbaeaa6161143de4a88c0c14465b4d87a364f02621b70f54c303b3fdbd0020b8b6e758976bef7e2ed76bc02488ca2abf949730af3d3d1bd4f"

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
