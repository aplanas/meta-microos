SUMMARY = "Create TikZ diagrams for your publications"
DESCRIPTION = "KtikZ is a small application helping you to create TikZ (from the LaTeX pgf \
package) diagrams for your publications. It requires qt5, libpoppler, LaTeX \
(pdflatex), the LaTeX preview-latex-style package and pgf itself. For \
the eps export functionality you also need the poppler-tools package."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.2"

RPM_NAME = "ktikz-0.13.2-1.7.aarch64.rpm"
RPM_HASH = "d804a8f0f8434ba560190977aad7c98c3b83b3276782d57f480b3159fc9b62e4a1fd41503badbcccbf7fd1dab867c67a0a04524c19fb6f8768ea5e0771932082"

RPROVIDES:${PN} += "application() \
application(ktikz.desktop) \
ktikz \
ktikz(aarch-64) \
metainfo() \
metainfo(ktikz.appdata.xml) \
mimehandler(text/x-pgf) \
mimehandler(text/x-tex)"

RDEPENDS:${PN} += "/bin/sh \
ktexteditor \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5TextEditor.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpoppler-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
