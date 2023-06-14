SUMMARY = "Plugin for the Qt Interface designer"
DESCRIPTION = "The qwt-designer package contains the plugin for the Qt User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-designer-5.2.3_qt5+git20181129.2819734-3.18.aarch64.rpm"
RPM_HASH = "2adc4608303997e4108c6bd1841aa45a5e752544199c8526fdbbd63dd103ae59051e85d250de24cdd69d2fee461b758b4b083a43bd4d4e63860a66b928428693"

RPROVIDES:${PN} += "libqwt5-designer-plugin.so \
qwt-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqwt5-qt5.so.5 \
libstdc++.so.6 \
qwt-devel"

inherit rpm
