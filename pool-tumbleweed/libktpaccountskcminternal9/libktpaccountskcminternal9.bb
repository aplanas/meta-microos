SUMMARY = "Library for KDE Telepathy accounts kcm"
DESCRIPTION = "This is a KControl Module which handles adding/editing/removing Telepathy \
Accounts. It interacts with any Telepathy Spec compliant AccountManager, \
such as telepathy-accountmanager-kwallet to manipulate the accounts. It is \
modular in design, with each ConnectionManager-Protocol combination having a \
plugin that provides customised forms for adding or editing their accounts, \
and also with a generic plugin which can be used as a fallback for \
ConnectionManager-Protocol combinations where no plugin exists."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libktpaccountskcminternal9-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f842ebe551617ad018bb08a607bd0c5dfcbf9d9beda8e643526e80baf9fe27d4421ea7bd3fab9587de8d924bf05e2ef2525a4c4f1fc61b8477701c509f75a2da"

RPROVIDES:${PN} += "libktpaccountskcminternal.so.9 \
libktpaccountskcminternal9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtelepathy-qt5.so.0"

inherit rpm
