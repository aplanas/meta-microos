SUMMARY = "Core library for the SynCE project"
DESCRIPTION = "The purpose of the SynCE project is to provide a means of communication with a Windows Mobile, or Windows CE, device from a computer running Linux, FreeBSD or a similar operating system. \
 \
Libsynce is a common library for various SynCE project tools, containing various utility and helper functions."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "libsynce0-0.15.1-13.29.aarch64.rpm"
RPM_HASH = "98bcbeabf8ccba96232f306eb76d7ae64c2b37340dab15a8551e809590e860d2c8d58d92fecfe114bd1637d634c8eb2ecfe072bf9f419d8ecd0f679126cff6bb"

RPROVIDES:${PN} += "libsynce \
libsynce.so.0 \
libsynce0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
