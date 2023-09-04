SUMMARY = "Utilities to export events from Windows XML event files (EVTX)"
DESCRIPTION = "Tools for parsing EVTX files. These include evtxinfo and evtxexport."
LICENSE = "LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx-tools-20221101-4.1.aarch64.rpm"
RPM_HASH = "1ac172ce5bd103290c813452af572855a5b0e03d290b369222900f7d1dbcb4a99dd329f8e5b0045328be4a03d5d52d43feaebb40b4741946ebb107130fbc7520"

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
