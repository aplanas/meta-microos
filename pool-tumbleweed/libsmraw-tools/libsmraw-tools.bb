SUMMARY = "Utilities for reading and writing storage media (split) RAW files"
DESCRIPTION = "This subpackage contains the utility programs from libsmraw to \
acquire, export, query and verify storage media (split) RAW files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-tools-20230320-1.8.aarch64.rpm"
RPM_HASH = "40f3f7184d79f2a7ec258cfe6c79685ec00e1aade0f496824fc30971378c499b6cac90d74726ee27c00682ee07dadbfc5b0948602b36f7fb087a72531062793c"

RPROVIDES:${PN} += "libsmraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libfuse.so.2 \
libhmac.so.1 \
libsmraw.so.1"

inherit rpm
