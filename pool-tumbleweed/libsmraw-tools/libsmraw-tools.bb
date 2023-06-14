SUMMARY = "Utilities for reading and writing storage media (split) RAW files"
DESCRIPTION = "This subpackage contains the utility programs from libsmraw to \
acquire, export, query and verify storage media (split) RAW files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-tools-20230320-1.3.aarch64.rpm"
RPM_HASH = "8fb38b627a7610c4ca8816399b69793b55d5549b0fe35f5ed472f7d729b43c301e6f10f820aff5763b12d346bf9f679629310177252b17df5c11f38da42cb85c"

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
