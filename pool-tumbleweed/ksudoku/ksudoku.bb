SUMMARY = "Program to generate and solve Sudoku puzzles in 2D or 3D"
DESCRIPTION = "KSudoku is a program that can generate and solve sudoku puzzles. The \
word Sudoku means 'single number in an alloted place' in Japanese. Some \
cells are filled with a number at the beginnning: the remaining are to \
be filled by the player using numbers from 1 to 9, without repeating a \
number twice on each column, row, or subsquare."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksudoku-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "54c5bd65784b127badec330cacd12c66ba4dd87ed8cc754be00767828d1e28a5fe9c65216c3e437247528f46aec1d85f43a3e5e80a3e9cd28d3d3bf6539239c6"

RPROVIDES:${PN} += "config-ksudoku \
ksudoku \
ksudoku5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDEGames.so.7 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libOpenGL.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
