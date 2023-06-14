SUMMARY = "Utilities to export events from Windows Event Log files"
DESCRIPTION = "Tools for reading Windows Event Log (EVT) files. These include \
evtinfo and evtexport. See evtxtools for Windows XML Event Log (EVTX) \
programs."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-tools-20221022-3.9.aarch64.rpm"
RPM_HASH = "d2336eae07c5787565fac7516865596a8851c73d9d644df298fec5fa40f22f8366ef14898202ebbd2d0076d810199731bbb0792d863e333c9024133176a6ea13"

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
