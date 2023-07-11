SUMMARY = "X Session Management library"
DESCRIPTION = "The X Session Management Protocol provides a uniform mechanism for \
users to save and restore their sessions. A session is a group of X \
clients (programs), each of which has a particular state. The session \
is controlled by a network service called the session manager, which \
issues commands to its clients on behalf of the user. These commands \
may cause clients to save their state or to terminate. It is expected \
that the client will save its state in such a way that the client can \
be restarted at a later time and resume its operation as if it had \
never been terminated."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "libSM6-1.2.4-2.3.aarch64.rpm"
RPM_HASH = "75844851896ca9180e28e931509020ada22f3e36acbb9f9750983090d6b3362d6670e78f9501900156ee02fab0d4353ae7f7d00bafbd31e3d3c71a948a8cd271"

RPROVIDES:${PN} += "libSM.so.6 \
libSM6 \
xorg-x11-libSM"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libc.so.6 \
libuuid.so.1"

inherit rpm
