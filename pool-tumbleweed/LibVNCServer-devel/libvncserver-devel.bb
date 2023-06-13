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

PV = "0.9.13"

RPM_NAME = "LibVNCServer-devel-0.9.13-4.4.aarch64.rpm"
RPM_HASH = "1231cd50eec54e09686738abcb3b3999b139c3b989ed9ba9b3b7fb4d24143b32f0094518e1652039792bc4a1ee188a098fa03ba431bc8f01968083a688a0bdbd"

RPROVIDES:${PN} += "LibVNCServer-devel \
LibVNCServer-devel(aarch-64) \
pkgconfig(libvncclient) \
pkgconfig(libvncserver)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnutls-devel \
libvncclient1 \
libvncserver1 \
zlib-devel"

inherit rpm
