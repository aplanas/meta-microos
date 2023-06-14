SUMMARY = "Popup Notes"
DESCRIPTION = "KNotes is a note taking application by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "knotes-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5c6a5bda0490de82bd8fdc29943a2532881a45add1700631e71c3fcd7ae1c8469aa650cc61ec006d1a5eac0b351392925f64b3c230005c680fe81d6a1c876cb6"

RPROVIDES:${PN} += "knotes \
knotes5 \
libknotesprivate.so.5 \
libnotesharedprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DNSSD.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5PimCommon.so.5 \
libKF5PimCommonAkonadi.so.5 \
libKF5TextAutoCorrection.so.1 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiAgentBase.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiSearchDebug.so.5 \
libKPim5AkonadiSearchPIM.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Mime.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
