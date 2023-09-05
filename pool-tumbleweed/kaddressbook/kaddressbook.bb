SUMMARY = "Address book application to manage contacts"
DESCRIPTION = "KAddressbook is an application by KDE to manage contacts."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kaddressbook-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "cb755f05a683a77ee95daca7a28d4039d947fc25c6646c20996397924bdfff37512375efb0bca039bdac77945277dbb07baff798c52604d40580cfb4e1250cca"

RPROVIDES:${PN} += "kaddressbook \
kaddressbook5 \
libkaddressbookprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdepim-runtime \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5KCMUtils.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AddressbookImportExport.so.5 \
libKPim5AddressbookImportExport5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiSearchDebug.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5ContactEditor.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5PimCommon.so.5 \
libKPim5PimCommonAkonadi.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
