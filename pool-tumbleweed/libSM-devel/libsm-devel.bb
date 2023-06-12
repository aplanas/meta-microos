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

RPM_NAME = "libSM-devel-1.2.4-2.2.aarch64.rpm"
RPM_HASH = "0219eaab2822477f2ebccd6350d8e1a121a14536e544903f26cedbd13917270df7066b6e11b5b075536c4e3dd0e85e4354d67e90886c37255f9197db00f6d5d9"

RPROVIDES:${PN} += "libSM-devel \
libSM-devel(aarch-64) \
pkgconfig(sm) \
xorg-x11-libSM-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSM6 \
pkgconfig(ice) \
pkgconfig(uuid) \
pkgconfig(xproto)"

inherit rpm
