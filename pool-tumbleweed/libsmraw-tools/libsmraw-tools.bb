SUMMARY = "Utilities for reading and writing storage media (split) RAW files"
DESCRIPTION = "This subpackage contains the utility programs from libsmraw to \
acquire, export, query and verify storage media (split) RAW files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-tools-20230320-2.1.aarch64.rpm"
RPM_HASH = "3730b6707388beea227b3371c6fca68dee9b29c2e84b0494e3599e6c52efc09da70442db98bd122d39b967f72769d02269f17fa42d1a6a79922b247a02e41023"

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
