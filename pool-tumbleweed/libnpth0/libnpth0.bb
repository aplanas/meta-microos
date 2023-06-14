SUMMARY = "GNU Portable Threads library"
DESCRIPTION = "nPth is a non-preemptive threads implementation using an API \
similar to the one in GNU Pth. In contrast to Pth, nPth is \
based on the system's standard threads implementation. Thus, nPth \
allows the use of libraries which are not compatible to GNU Pth."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "libnpth0-1.6-2.10.aarch64.rpm"
RPM_HASH = "863a7db1ac23ad79a93143cc9f71c7494c201f84bc03d9969c3cbd2f6699404714e096a61e134e7b60ae340e680751595e6bb4af4467626f0027dae39473b8b4"

RPROVIDES:${PN} += "libnpth.so.0 \
libnpth0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
