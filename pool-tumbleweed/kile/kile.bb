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

RPM_NAME = "kile-2.9.93-2.21.aarch64.rpm"
RPM_HASH = "0e8a002a31851b4912168e3c3f02668576c59d81115bf48fc86f6d75495022afccac0f51fd441fc8678e7e2c6b17f4d8af89e057b02d4e6b22c671f264ebeb15"

RPROVIDES:${PN} += "application() \
application(org.kde.kile.desktop) \
kile \
kile(aarch-64) \
kile5 \
libkdeinit5_kile.so()(64bit) \
metainfo() \
metainfo(org.kde.kile.appdata.xml) \
mimehandler(text/x-kilepr) \
mimehandler(text/x-tex)"
RDEPENDS:${PN} += "/usr/bin/perl \
konsole-part \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KHtml.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5TextEditor.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Script.so.5()(64bit) \
libQt5Script.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpoppler-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
okular \
shared-mime-info \
texlive-context \
texlive-latex \
texlive-xetex"

inherit rpm
