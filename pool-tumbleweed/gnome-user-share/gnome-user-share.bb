SUMMARY = "GNOME user file sharing"
DESCRIPTION = "gnome-user-share is a small package that binds together various free \
software projects to bring easy to use user-level file sharing to the \
masses. \
 \
The program is meant to run in the background when the user is logged \
in, and when file sharing is enabled a webdav server is started that \
shares the $HOME/Public folder. The share is then published to all \
computers on the local network using mDNS/rendezvous, so that it shows \
up in the Network location in GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-user-share-43.0-1.4.aarch64.rpm"
RPM_HASH = "2cc2f469cf28f29bf74440e636f46b69f36de34af1b46768d37c24f98942e562b9dc59998b8774806670375e0728f715d7c6405d515e3d3a95334ae16d72cef8"

RPROVIDES:${PN} += "gnome-user-share"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libselinux.so.1"

inherit rpm
