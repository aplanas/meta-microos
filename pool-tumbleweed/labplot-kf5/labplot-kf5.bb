SUMMARY = "KDE Framework 5 data analysis and visualization application"
DESCRIPTION = "LabPlot is a KDE application for interactive graphing and analysis \
of scientific data. LabPlot provides an easy way to create, manage \
and edit plots. It allows you to produce plots based on data from a \
spreadsheet or on data imported from external files. Plots can be \
exported to several pixmap and vector graphic formats. \
 \
This version is based on KDE Frameworks 5"
LICENSE = "GPL-2.0-or-later"

PV = "2.10.0"

RPM_NAME = "labplot-kf5-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "adaf06d24650b211c7a90215d654677371e561a09302abf4254aaf367e1b7c35c4897d38ee3b9445373ea8d555d532167a1a45f30c3687a7f3314cdba07aa759"

RPROVIDES:${PN} += "application() \
application(org.kde.labplot2.desktop) \
labplot \
labplot-kf5 \
labplot-kf5(aarch-64) \
metainfo() \
metainfo(org.kde.labplot2.appdata.xml) \
mimehandler(application/x-LabPlot-gzip) \
mimehandler(application/x-LabPlot-xz) \
mimehandler(application/x-labplot2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5SerialPort.so.5()(64bit) \
libQt5SerialPort.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libcantorlibs.so.28()(64bit) \
libcerf.so.2()(64bit) \
libcfitsio.so.10()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libhdf5.so.200()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libmatio.so.11()(64bit) \
libnetcdf.so.19()(64bit) \
liborigin.so.3()(64bit) \
libpoppler-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
