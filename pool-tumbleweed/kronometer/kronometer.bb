SUMMARY = "A stopwatch application by KDE"
DESCRIPTION = "Kronometer is a stopwatch application. \
 \
Kronometer's main features are the following: \
 \
* Start/pause/resume the stopwatch widget \
* Laps recording: you can capture the stopwatch time when you want and add a note to it \
* Lap times sorting: you can easily find the shortest lap time or the longest one \
* Reset the stopwatch widget and the lap times \
* Time format settings: you can choose the stopwatch granularity \
* Times saving and resuming: you can save the stopwatch status and resume it later \
* Font customization: you can choose the fonts for each of the stopwatch digits \
* Color customization: you can choose the color for the stopwatch digits and the stopwatch background \
* Lap times export: you can export the lap times on a file using the JSON or CSV format"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.3"

RPM_NAME = "kronometer-2.2.3-2.12.aarch64.rpm"
RPM_HASH = "55f2a9540b0813c4280b2b6236e000dfa0fea464ba20114cbbc355418c97c22e76ea35e6204c96e0b27ea21d13c692894145f9822381b1670cd8832ab8fe964f"

RPROVIDES:${PN} += "kronometer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
