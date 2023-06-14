SUMMARY = "File activity monitoring tool"
DESCRIPTION = "Fnotifystat periodically dumps out the activity on files in the system. It can \
be used to identify rogue file activity and discover which processes are \
performing open/close/read/write operations on the files."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "fnotifystat-0.02.06-1.12.aarch64.rpm"
RPM_HASH = "ec1cae39a3923e414fa02e4bf28872727dcab2dd9bf86d23cf0446ae1e66e66944a9ac468fcb6797ed0916a3103d8e19ca85e3ba47f83422cd7fb94faaa539de"

RPROVIDES:${PN} += "fnotifystat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
