SUMMARY = "Utilities for HMACs"
DESCRIPTION = "Use hmacsum to calculate a Hash-based Message Authentication Code (HMAC) of the data in a file."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac-tools-20230407-1.1.aarch64.rpm"
RPM_HASH = "5a95ef13156c21fe924ee54f36c35a60531741ef25b80c5f42fd562781894f989db57c3f1a5fc71ef70fa42f84f4b68a8a60de973c0c6505e1b0d1008a3dc9c0"

RPROVIDES:${PN} += "libhmac-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libhmac.so.1"

inherit rpm
