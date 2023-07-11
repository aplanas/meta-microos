SUMMARY = "Development files for the X Session Management library"
DESCRIPTION = "The X Session Management Protocol provides a uniform mechanism for \
users to save and restore their sessions. A session is a group of X \
clients (programs), each of which has a particular state. The session \
is controlled by a network service called the session manager, which \
issues commands to its clients on behalf of the user. These commands \
may cause clients to save their state or to terminate. It is expected \
that the client will save its state in such a way that the client can \
be restarted at a later time and resume its operation as if it had \
never been terminated. \
 \
This package contains the development headers for the library found \
in libSM6."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "libSM-devel-1.2.4-2.3.aarch64.rpm"
RPM_HASH = "6991fd34c116e873cedb2d06706469b17b96c82fb03822a70df9939587482232e12d1ba85ddbc2a396097cd341ea0ddb5d1b90667757a3f965ca090b15d9666d"

RPROVIDES:${PN} += "libSM-devel \
pkgconfig-sm \
xorg-x11-libSM-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSM6 \
pkgconfig-ice \
pkgconfig-uuid \
pkgconfig-xproto"

inherit rpm
