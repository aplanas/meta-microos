SUMMARY = "Nemo extension for filename encoding repair"
DESCRIPTION = "This is a Nemo extension which repairs filename which uses wrong \
encoding in Nemo. This extension provides the context menu for any \
file whose filename uses wrong encoding, so that you cannot read the \
filename in Nemo. \
 \
You can find a candidate for filename in context menu or submenu. \
This extension also provides a decoded name for URL encoded filename."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-repairer-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "2d807b3b63f35bae5948b9decfadc250bbfd4ce1e40c8e2d1318d03fe9d805c579d983e6f48e3e2a2fef22edc5b9fed8def2ab14d45ff4b6f9e180cf7abe46a4"

RPROVIDES:${PN} += "libnemo-filename-repairer.so \
nemo-extension-repairer \
nemo-repairer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
