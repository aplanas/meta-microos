SUMMARY = "Create TikZ diagrams for your publications"
DESCRIPTION = "KtikZ is a small application helping you to create TikZ (from the LaTeX pgf \
package) diagrams for your publications. It requires qt5, libpoppler, LaTeX \
(pdflatex), the LaTeX preview-latex-style package and pgf itself. For \
the eps export functionality you also need the poppler-tools package."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.2"

RPM_NAME = "ktikz-0.13.2-1.8.aarch64.rpm"
RPM_HASH = "fd59b41365c989437486abdcaf133f35cb92151d41b5cc9709e1f759a62bcc3f7583baa7563fe9d13e16bf19904db5cf6c1b3374f845ea39fd09424127bff36e"

RPROVIDES:${PN} += "ktikz"

RDEPENDS:${PN} += "/usr/bin/sh \
ktexteditor \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5TextEditor.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6"

inherit rpm
