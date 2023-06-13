SUMMARY = "A Port of Tomboy to C++"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnote-44.0-1.1.aarch64.rpm"
RPM_HASH = "1c72e8bb575306145030301084c9a93ec6b40827be02f963d0d58d589b1be363e1000e1132bd703e4a5db794ad41a679dc6d309150aa93a69ca76cc536c9ed29"

RPROVIDES:${PN} += "application() \
application(org.gnome.Gnote.desktop) \
gnote \
gnote(aarch-64) \
libbacklinks.so()(64bit) \
libbugzilla.so()(64bit) \
libexporttogtg.so()(64bit) \
libexporttohtml.so()(64bit) \
libfilesystemsyncservice.so()(64bit) \
libfixedwidth.so()(64bit) \
libgnote-44.so.0()(64bit) \
libgvfssyncservice.so()(64bit) \
libinserttimestamp.so()(64bit) \
libnotedirectorywatcher.so()(64bit) \
libnoteoftheday.so()(64bit) \
libprintnotes.so()(64bit) \
libreadonly.so()(64bit) \
libreplacetitle.so()(64bit) \
libspecialnotes.so()(64bit) \
libstatistics.so()(64bit) \
libstickynoteimport.so()(64bit) \
libtableofcontents.so()(64bit) \
libtodo.so()(64bit) \
libtomboyimport.so()(64bit) \
libunderline.so()(64bit) \
libwebdavsyncservice.so()(64bit) \
metainfo() \
metainfo(org.gnome.Gnote.appdata.xml) \
mimehandler(x-scheme-handler/note)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsecret-1.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
