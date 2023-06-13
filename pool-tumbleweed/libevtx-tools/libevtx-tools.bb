SUMMARY = "Utilities to export events from Windows XML event files (EVTX)"
DESCRIPTION = "Tools for parsing EVTX files. These include evtxinfo and evtxexport."
LICENSE = "LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx-tools-20221101-3.10.aarch64.rpm"
RPM_HASH = "755a0608137e9764d13868b09ad81b3431f4cd30737f140e446103e3034f0474bc5ee5841f9be34304b51a7add01574102856f589983a196f03262a219762cad"

RPROVIDES:${PN} += "libevtx-tools \
libevtx-tools(aarch-64)"

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
libevtx.so.1()(64bit) \
libevtx.so.1(V_20221101)(64bit) \
libexe.so.1()(64bit) \
libexe.so.1(V_20210424)(64bit) \
libfcache.so.1()(64bit) \
libfcache.so.1(V_20230115)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfwevt.so.1()(64bit) \
libfwevt.so.1(V_20230410)(64bit) \
libregf.so.1()(64bit) \
libregf.so.1(V_20230319)(64bit) \
libwrc.so.1()(64bit) \
libwrc.so.1(V_20230318)(64bit)"

inherit rpm
