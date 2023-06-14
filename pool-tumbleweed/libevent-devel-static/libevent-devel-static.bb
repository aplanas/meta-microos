SUMMARY = "Static libraries for libevent2"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
This package holds the static libraries for libevent2."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-devel-static-2.1.12-3.4.aarch64.rpm"
RPM_HASH = "5572f216e075d8cc9d2b147ac28f51853e990e20c2ce7634b8afb75c21045ad5c04a428168cf2f97340946499484f43d04560d7065907041b58f82e0744e6e90"

RPROVIDES:${PN} += "libevent-devel-static"

RDEPENDS:${PN} += "libevent-devel"

inherit rpm
