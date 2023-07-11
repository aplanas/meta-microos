SUMMARY = "Library and tools to access the Apple Partition Map volume system format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210626"

RPM_NAME = "python39-libvsapm-20210626-4.9.aarch64.rpm"
RPM_HASH = "3e3e3e3422bdd50763b3db5f7f261ffb6198ad6908e81fe6de53ec5f2e6361db7030744b34322da966107ae121c099e323d0cb7b1b0ce99f5e867e68a1f63410"

RPROVIDES:${PN} += "python39-libvsapm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsapm.so.1 \
python-abi"

inherit rpm
