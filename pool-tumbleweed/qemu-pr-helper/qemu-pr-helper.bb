SUMMARY = "QEMU persistent reservation helper"
DESCRIPTION = "This package provides a helper utility for SCSI persistent reservations."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-pr-helper-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "faa293cdd9b3cf7b0a8f9a756b3f7b97993f01b93d9019d11adefd0fd14edf8de1889e8cb601af5ec189aedc17b6a35076623ef1028e3840c75d7cbcfb26a015"

RPROVIDES:${PN} += "qemu-pr-helper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libmpathpersist.so.0 \
libnuma.so.1 \
libpam.so.0 \
libudev.so.1 \
liburing.so.2"

inherit rpm
