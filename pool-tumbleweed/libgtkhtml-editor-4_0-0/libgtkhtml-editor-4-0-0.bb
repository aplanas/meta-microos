SUMMARY = "Lightweight HTML rendering/printing/editing engine"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "libgtkhtml-editor-4_0-0-4.10.0-7.3.aarch64.rpm"
RPM_HASH = "3020c02df872010f1d3063b380b9c2a155e11f55c27086111b9c2e8f8ac6919594d3efa9265efa60d5ea37060a3ca5914beb259c6ef7509b6719477d31ae9ca0"

RPROVIDES:${PN} += "libgtkhtml-editor-4.0.so.0()(64bit) \
libgtkhtml-editor-4_0-0 \
libgtkhtml-editor-4_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libenchant.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkhtml-4.0.so.0()(64bit)"

inherit rpm
