SUMMARY = "Netscape Portable Runtime development files"
DESCRIPTION = "NSPR provides platform independence for non-GUI operating system \
facilities. These facilities include threads, thread synchronization, \
normal file and network I/O, interval timing and calendar time, basic \
memory management (malloc and free), and shared library linking."
LICENSE = "MPL-2.0"

PV = "4.35"

RPM_NAME = "mozilla-nspr-devel-4.35-1.4.aarch64.rpm"
RPM_HASH = "6427ac081ea2dd0f4cf6501e04a642c000a365d290e18c393051ee694c76e6ae54f07b6b2be5614dcca282e465304ff79ab05f737884c996eda0a314af19fc4b"

RPROVIDES:${PN} += "mozilla-nspr-devel \
pkgconfig-nspr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
mozilla-nspr"

inherit rpm
