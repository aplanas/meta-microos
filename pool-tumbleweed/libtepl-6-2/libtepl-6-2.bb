SUMMARY = "A text editor framework"
DESCRIPTION = "Tepl (Text Editor Product Line) is a library that eases the \
development of GtkSourceView-based text editors and IDEs. It is a \
continuation / rename of Gtef"
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "libtepl-6-2-6.4.0-1.5.aarch64.rpm"
RPM_HASH = "d87f63a1acadcc30fe2387cc3269ec4cbfc30e2c5a2600c0d1e76c07378995f12ad31657211e5269747ae71a4446ce7dc3ab25cf43ba552a3392764862464cb7"

RPROVIDES:${PN} += "libtepl-6-2 \
libtepl-6.so.2 \
tepl-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libamtk-5.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libpango-1.0.so.0"

inherit rpm
