SUMMARY = "A Port of Tomboy to C++"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnote-44.0-1.1.aarch64.rpm"
RPM_HASH = "1c72e8bb575306145030301084c9a93ec6b40827be02f963d0d58d589b1be363e1000e1132bd703e4a5db794ad41a679dc6d309150aa93a69ca76cc536c9ed29"

RPROVIDES:${PN} += "gnote \
libbacklinks.so \
libbugzilla.so \
libexporttogtg.so \
libexporttohtml.so \
libfilesystemsyncservice.so \
libfixedwidth.so \
libgnote-44.so.0 \
libgvfssyncservice.so \
libinserttimestamp.so \
libnotedirectorywatcher.so \
libnoteoftheday.so \
libprintnotes.so \
libreadonly.so \
libreplacetitle.so \
libspecialnotes.so \
libstatistics.so \
libstickynoteimport.so \
libtableofcontents.so \
libtodo.so \
libtomboyimport.so \
libunderline.so \
libwebdavsyncservice.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangomm-1.4.so.1 \
libsecret-1.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
