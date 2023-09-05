SUMMARY = "KDE Framework 5 data analysis and visualization application"
DESCRIPTION = "LabPlot is a KDE application for interactive graphing and analysis \
of scientific data. LabPlot provides an easy way to create, manage \
and edit plots. It allows you to produce plots based on data from a \
spreadsheet or on data imported from external files. Plots can be \
exported to several pixmap and vector graphic formats. \
 \
This version is based on KDE Frameworks 5"
LICENSE = "GPL-2.0-or-later"

PV = "2.10.1"

RPM_NAME = "labplot-kf5-2.10.1-2.1.aarch64.rpm"
RPM_HASH = "34e99bf2c5ebdd6032fe416fe7b5635f239d83321a063b5ce064ca92c92271ee1c18070511124a198259676fc821d4c3ae2e187de06eca65f045dd5d4dc12dc8"

RPROVIDES:${PN} += "labplot \
labplot-kf5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5SerialPort.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcantorlibs.so.28 \
libcerf.so.2 \
libcfitsio.so.10 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5.so.200 \
liblz4.so.1 \
libm.so.6 \
libmatio.so.11 \
libnetcdf.so.19 \
liborigin.so.3 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
