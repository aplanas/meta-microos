SUMMARY = "Utilities to export events from Windows XML event files (EVTX)"
DESCRIPTION = "Tools for parsing EVTX files. These include evtxinfo and evtxexport."
LICENSE = "LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libevtx-tools-20221101-3.11.aarch64.rpm"
RPM_HASH = "684bffa03dd2e9686fa12985d3ffcfb9f08da6276a2b06de7275b3d366fa423fc4121326a746b224b7e7fc2b6695bb1ccc8ac7135f3366ff337abf428f540368"

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
