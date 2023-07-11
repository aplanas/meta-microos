SUMMARY = "Configuration module to set up Telepathy accounts"
DESCRIPTION = "This is a KControl Module which handles adding/editing/removing Telepathy \
Accounts. It interacts with any Telepathy Spec compliant AccountManager, \
such as telepathy-accountmanager-kwallet to manipulate the accounts. It is \
modular in design, with each ConnectionManager-Protocol combination having a \
plugin that provides customised forms for adding or editing their accounts, \
and also with a generic plugin which can be used as a fallback for \
ConnectionManager-Protocol combinations where no plugin exists."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-accounts-kcm-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "24143a0398941555232beb112ffac861f6a27049734515f275b90a44b2d1151342be311b54e2db9c75aa5beb65517de9b5cb4ed3c4311c15e8348958d16682d1"

RPROVIDES:${PN} += "ktp-accounts-kcm \
ktp-accounts-kcm5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libkaccounts.so.2 \
libktpaccountskcminternal.so.9 \
libsignon-qt5.so.1 \
libstdc++.so.6 \
libtelepathy-qt5.so.0 \
telepathy-mission-control"

inherit rpm
