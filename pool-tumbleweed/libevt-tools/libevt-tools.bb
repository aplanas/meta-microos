SUMMARY = "Utilities to export events from Windows Event Log files"
DESCRIPTION = "Tools for reading Windows Event Log (EVT) files. These include \
evtinfo and evtexport. See evtxtools for Windows XML Event Log (EVTX) \
programs."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-tools-20221022-4.1.aarch64.rpm"
RPM_HASH = "f88798852511d8107e58a4fa642522cfc256c5990db7885d3d7c72b15c1d9dbbe4c2487b50d84a455c7be8f14d7e7e87d43804dd78dd2b4e3fa52af761cdd910"

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
