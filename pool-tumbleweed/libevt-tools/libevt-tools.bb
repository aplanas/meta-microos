SUMMARY = "Utilities to export events from Windows Event Log files"
DESCRIPTION = "Tools for reading Windows Event Log (EVT) files. These include \
evtinfo and evtexport. See evtxtools for Windows XML Event Log (EVTX) \
programs."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-tools-20221022-3.12.aarch64.rpm"
RPM_HASH = "452f1512a393d84d4ac1d6212e5d7ab39b9784fb7d8f359ebd3597cbcc28c52a4fcebf2fc1db398a442dd4262fa44bfd2983c505a809d0a729f212c107062d3d"

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
