SUMMARY = "Development Files for Linux-native Asynchronous I/O Access"
DESCRIPTION = "This package provides header files to include, and libraries to link \
with, for the Linux-native asynchronous I/O facility ('async I/O', or \
'aio')."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.113"

RPM_NAME = "libaio-devel-0.3.113-3.1.aarch64.rpm"
RPM_HASH = "afc0a478743763aa3dec709b37c7fa0000111a76fc2869e1a17be6ff8e8618af89b9a148d62a9d8c2634fad3fa60d6a3bcde81d93ae396e5febfda7c9f4a2ced"

RPROVIDES:${PN} += "libaio-devel \
libaio-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libaio1"

inherit rpm
