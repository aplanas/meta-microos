SUMMARY = "A Port of Tomboy to C++"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnote-44.0-1.2.aarch64.rpm"
RPM_HASH = "78921c6e3ac307edecbc447aa8df2120917bd3fb5bb8b2a99a9a4bc5a8ca6c8bf7675518c58347216db8ea871770784d71d401bb8305f934b75182811b3ccbf2"

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
