SUMMARY = "Telepathy Mission Control instant messaging connection manager"
DESCRIPTION = "Mission Control, or MC, is a Telepathy component providing a way for \
'end-user' applications to abstract some of the details of connection \
managers, to provide a simple way to manipulate a bunch of connection \
managers at once, to remove the need to have in each program the \
account definitions and credentials, to manage channel handling/request \
and to manage presence statuses."
LICENSE = "LGPL-2.1-only"

PV = "5.16.6"

RPM_NAME = "telepathy-mission-control-devel-5.16.6-1.9.aarch64.rpm"
RPM_HASH = "da2c6d302d69f4bef8fef94079681547d10561a70d5845312461abc904625ff0d43115fb3d6cbbb77ae34294bb2877db4b94bbac87d00989ede3cba3d2f22532"

RPROVIDES:${PN} += "pkgconfig(mission-control-plugins) \
telepathy-mission-control-devel \
telepathy-mission-control-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmission-control-plugins0 \
pkgconfig(telepathy-glib) \
telepathy-mission-control"

inherit rpm
