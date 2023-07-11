SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "python310-libvsapm-20210626-4.9.aarch64.rpm"
RPM_HASH = "d962f6c2dcfe5264555c2bda8f45b9361e1c357a3d061eac1a8c26302e7b28882c610dc607dff446c4d65fa1b3244530a96aebc2fa299752f642252bac9ec4fe"

RPROVIDES:${PN} += "python310-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm
