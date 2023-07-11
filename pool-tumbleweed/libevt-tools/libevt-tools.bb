SUMMARY = "Utilities to export events from Windows Event Log files"
DESCRIPTION = "Tools for reading Windows Event Log (EVT) files. These include \
evtinfo and evtexport. See evtxtools for Windows XML Event Log (EVTX) \
programs."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-tools-20221022-3.11.aarch64.rpm"
RPM_HASH = "df360f0f0cd28bd6d38c2d6c7b00590e63a638d81aad8abaf770856ce3308c65f067186e08dbad7c395d243effa4e6efb6f03024df9a1f4ce46d327d15410396"

RPROVIDES:${PN} += "libevt-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdirectory.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libevt.so.1 \
libexe.so.1 \
libfcache.so.1 \
libfdatetime.so.1 \
libfwevt.so.1 \
libregf.so.1 \
libwrc.so.1"

inherit rpm
