SUMMARY = "Development files for the Qt5 Data Visualization module"
DESCRIPTION = "This package provides header files and shared libraries for development with \
Qt Data Visualization."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5DataVisualization5-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "37739b397028db4ca831908813a19eee36f6daadaa866d65df8c522d3e966ba6cfc995b7d98a888d41166f25bc15f0c9845efe7a93621fd8cfc67c31fcc604a7"

RPROVIDES:${PN} += "cmake(Qt5DataVisualization) \
libQt5DataVisualization5-devel \
libQt5DataVisualization5-devel(aarch-64) \
pkgconfig(Qt5DataVisualization)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5DataVisualization5 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui)"

inherit rpm
