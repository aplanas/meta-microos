SUMMARY = "TODO Application"
DESCRIPTION = "Zanshin Todo is an application for managing your day-to-day actions. \
It helps you organize and reduce the cognitive pressure of what one has to do in his \
job and personal life. You will never forget anything anymore."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "zanshin-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c4df4b3d5301173bfd3e9932cd713f513568494d67936d5f2ec83d1a19ed0d9d910882a0222efe30b494c8bd13e3516c7e4458e43199f36e52f3e5b9f46f6078"

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
