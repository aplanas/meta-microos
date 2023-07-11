SUMMARY = "VNC Development Library"
DESCRIPTION = "VNC is a set of programs using the RFB (Remote Frame Buffer) protocol. \
They are designed to 'export' a frame buffer via the network. It is \
already in wide use for administration, but it is not that easy to \
program a server yourself. This has been changed by LibVNCServer. \
 \
X.org already has a virtual Xvnc server which you can start as an own \
screen (e.g. :1) and connect to with a VNC client (e.g. vncviewer from \
tightvnc). \
 \
The LibVNCServer-devel package contains the static libraries and header \
files for LibVNCServer."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "LibVNCServer-devel-0.9.14-1.1.aarch64.rpm"
RPM_HASH = "1afbf388bd6f347bcd607f181284162111e28b2593146a51b86beb83d2055f95882a7d0b11aedb4fedc6d6a4e24332a99901f2fd1ab6b30d80f3793754b497fa"

RPROVIDES:${PN} += "LibVNCServer-devel \
cmake-LibVNCServer \
pkgconfig-libvncclient \
pkgconfig-libvncserver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnutls-devel \
libvncclient1 \
libvncserver1 \
zlib-devel"

inherit rpm
