SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "python39-libfmos-20230707-2.1.aarch64.rpm"
RPM_HASH = "bc870c96087ba5148f422121fa3e07b897702ade735ba07b09b29dd40051912ee96b6cba3c77034ab8bb92c5819635e3dc5e7a30b52a88572ae6f52c9472d8ba"

RPROVIDES:${PN} += "python39-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
