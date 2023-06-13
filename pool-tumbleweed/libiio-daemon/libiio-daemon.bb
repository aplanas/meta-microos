SUMMARY = "Industrial I/O library -- iiod"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the iiod daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-daemon-0.24-1.4.aarch64.rpm"
RPM_HASH = "5cd131c3b1d8b6b1d2943b869f0212ed7355b9878e6650501bb70bbd1c50f4045c9126a4a37309b2ed6ae61d86fb294cdb7c993561e35775ca0aa6094322a96e"

RPROVIDES:${PN} += "libiio-daemon \
libiio-daemon(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libiio.so.0()(64bit)"

inherit rpm
