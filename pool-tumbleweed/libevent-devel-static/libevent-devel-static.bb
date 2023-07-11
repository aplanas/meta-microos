SUMMARY = "Static libraries for libevent2"
DESCRIPTION = "The libevent API provides a mechanism to execute a callback function \
when a specific event occurs on a file descriptor or after a timeout \
has been reached. Furthermore, libevent also support callbacks due to \
signals or regular timeouts. \
 \
This package holds the static libraries for libevent2."
LICENSE = "BSD-3-Clause"

PV = "2.1.12"

RPM_NAME = "libevent-devel-static-2.1.12-3.5.aarch64.rpm"
RPM_HASH = "b7c72c9afde269394d8872499f8ba957928e9a0c2e589962b55ddb1871b358d6991ebf450a9f706e85edaff8ecfb78b070cd068da11d2e695ac6ea511a4c8b4a"

RPROVIDES:${PN} += "libevent-devel-static"

RDEPENDS:${PN} += "libevent-devel"

inherit rpm
