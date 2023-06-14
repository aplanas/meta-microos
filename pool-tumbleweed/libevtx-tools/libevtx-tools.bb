SUMMARY = "Utilities to export events from Windows XML event files (EVTX)"
DESCRIPTION = "Tools for parsing EVTX files. These include evtxinfo and evtxexport."
LICENSE = "LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx-tools-20221101-3.10.aarch64.rpm"
RPM_HASH = "755a0608137e9764d13868b09ad81b3431f4cd30737f140e446103e3034f0474bc5ee5841f9be34304b51a7add01574102856f589983a196f03262a219762cad"

RPROVIDES:${PN} += "libevtx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdirectory.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcsplit.so.1 \
libevtx.so.1 \
libexe.so.1 \
libfcache.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwevt.so.1 \
libregf.so.1 \
libwrc.so.1"

inherit rpm
