SUMMARY = "C++ library for symbolic calculations"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "ginac-1.8.6-1.1.aarch64.rpm"
RPM_HASH = "5164657280c9b49b15d4f4fa9c2f9bf6a174bdf479832836a9d6c072b877d2e485c3fdfeb67df848fc353611c04542fc2b88bf9204c2cb4ae9e6bcbaa479fd4b"

RPROVIDES:${PN} += "ginac"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcln.so.6 \
libgcc-s.so.1 \
libginac.so.11 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
