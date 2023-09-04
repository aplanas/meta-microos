SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan1-20230109-2.1.aarch64.rpm"
RPM_HASH = "53243c7ad2cbef38cb2ec109b8e49f0de60b9216192d0c5d6cc4ba7cb0ffcf7e59c7e1544629291056378014ac4b65fdbb4949e30dcf8fdca94c49425f4dcb56"

RPROVIDES:${PN} += "libsigscan.so.1 \
libsigscan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1"

inherit rpm
