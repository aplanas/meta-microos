SUMMARY = "A LaTeX Source Editor and TeX Shell"
DESCRIPTION = "Kile is a user-friendly TeX/LaTeX editor by KDE. \
 \
The main features are: \
 \
 * Compile, convert and view your document with one click. \
 * Auto-completion of (La)TeX commands. \
 * Templates and wizards make starting a new document very little work. \
 * Easy insertion of many standard tags and symbols and the option to define \
   (an arbitrary number of) user defined tags. \
 * Inverse and forward search: click in the DVI viewer and jump to the \
   corresponding LaTeX line in the editor, or jump from the editor to the \
   corresponding page in the viewer. \
 * Finding chapter or sections is very easy, Kile constructs a list of all the \
   chapter etc. in your document. You can use the list to jump to the \
   corresponding section. \
 * Collect documents that belong together into a project. \
 * Easy insertion of citations and references when using projects. \
 * Flexible and smart build system to compile your LaTeX documents. \
 * QuickPreview, preview a selected part of your document. \
 * Easy access to various help sources. \
 * Advanced editing commands."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.93"

RPM_NAME = "kile-2.9.93-2.22.aarch64.rpm"
RPM_HASH = "63563c374cfa7e2b89f76fdbec6d8a39d5357fe4d6d7bbe32aa02a48054a8cb2a8ba4d682acae9b5ecdf3c870d810059786d60b3d1909b77d568fec925a8fe8d"

RPROVIDES:${PN} += "kile \
kile5 \
libkdeinit5-kile.so"

RDEPENDS:${PN} += "/usr/bin/perl \
konsole-part \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KHtml.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
okular \
shared-mime-info \
texlive-context \
texlive-latex \
texlive-xetex"

inherit rpm
