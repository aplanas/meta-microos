SUMMARY = "Netscape Portable Runtime"
DESCRIPTION = "NSPR provides platform independence for non-GUI operating system \
facilities. These facilities include threads, thread synchronization, \
normal file and network I/O, interval timing and calendar time, basic \
memory management (malloc and free), and shared library linking."
LICENSE = "MPL-2.0"

PV = "4.35"

RPM_NAME = "mozilla-nspr-4.35-1.3.aarch64.rpm"
RPM_HASH = "5dc38ccefd0e80dd22ea42ff84515fbef02699b35413ae996c7285aa7b9eb50bfd9d5a173e52b748c2624417ee58ccf9b018023363b7b7efa34a6f59652e1f35"

RPROVIDES:${PN} += "libnspr4.so()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
mozilla-nspr \
mozilla-nspr(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
