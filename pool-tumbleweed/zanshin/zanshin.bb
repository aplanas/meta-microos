SUMMARY = "TODO Application"
DESCRIPTION = "Zanshin Todo is an application for managing your day-to-day actions. \
It helps you organize and reduce the cognitive pressure of what one has to do in his \
job and personal life. You will never forget anything anymore."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "zanshin-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7664841ba4a07a1359c8014431f19a09d53020fef22c8519a72abe3b90a9a623208e17b6481e38ee3853063e46ef81aaa4c69d9f1e398fbe632fb312bb47db9e"

RPROVIDES:${PN} += "zanshin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5Parts.so.5 \
libKF5Runner.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5KontactInterface.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
