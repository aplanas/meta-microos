SUMMARY = "Utilities to export events from Windows Event Log files"
DESCRIPTION = "Tools for reading Windows Event Log (EVT) files. These include \
evtinfo and evtexport. See evtxtools for Windows XML Event Log (EVTX) \
programs."
LICENSE = "LGPL-3.0-or-later"

PV = "20221022"

RPM_NAME = "libevt-tools-20221022-3.9.aarch64.rpm"
RPM_HASH = "d2336eae07c5787565fac7516865596a8851c73d9d644df298fec5fa40f22f8366ef14898202ebbd2d0076d810199731bbb0792d863e333c9024133176a6ea13"

RPROVIDES:${PN} += "libevt-tools \
libevt-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcdirectory.so.1()(64bit) \
libcdirectory.so.1(V_20220105)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcpath.so.1()(64bit) \
libcpath.so.1(V_20220108)(64bit) \
libcsplit.so.1()(64bit) \
libcsplit.so.1(V_20220109)(64bit) \
libevt.so.1()(64bit) \
libevt.so.1(V_20221022)(64bit) \
libexe.so.1()(64bit) \
libexe.so.1(V_20210424)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfwevt.so.1()(64bit) \
libfwevt.so.1(V_20230410)(64bit) \
libregf.so.1()(64bit) \
libregf.so.1(V_20230319)(64bit) \
libwrc.so.1()(64bit) \
libwrc.so.1(V_20230318)(64bit)"

inherit rpm
