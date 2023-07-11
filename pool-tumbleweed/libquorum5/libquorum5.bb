SUMMARY = "Corosync quorum library"
DESCRIPTION = "The quorum library is the external interface to the quorum service. \
This service is loaded into all nodes in a Corosync cluster and track \
the quorum status of a node."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libquorum5-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "76bae64b16a4321b588971148c6c66f016c67e398a8224c28664555b19f2ad70e6d40b0117491e415598b789bd482b5ebc132fe973fbae3b30bcdea1f69ef1ae"

RPROVIDES:${PN} += "libquorum.so.5 \
libquorum5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcorosync-common.so.4 \
libqb.so.100"

inherit rpm
