SUMMARY = "Telepathy Mission Control instant messaging connection manager"
DESCRIPTION = "Mission Control, or MC, is a Telepathy component providing a way for \
'end-user' applications to abstract some of the details of connection \
managers, to provide a simple way to manipulate a bunch of connection \
managers at once, to remove the need to have in each program the \
account definitions and credentials, to manage channel handling/request \
and to manage presence statuses."
LICENSE = "LGPL-2.1-only"

PV = "5.16.6"

RPM_NAME = "telepathy-mission-control-5.16.6-1.9.aarch64.rpm"
RPM_HASH = "a69d0ace9ee879b4ef927c1739a075686f4f47ee46f1dd7cd966c7fe7b36788726187123e726f54c4cdcd695e6dbd6241f54a02780f424ba49110a876fefb105"

RPROVIDES:${PN} += "telepathy-mission-control"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmission-control-plugins.so.0 \
libnm.so.0 \
libtelepathy-glib.so.0"

inherit rpm
