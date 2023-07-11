SUMMARY = "Telepathy Mission Control instant messaging connection manager"
DESCRIPTION = "Mission Control, or MC, is a Telepathy component providing a way for \
'end-user' applications to abstract some of the details of connection \
managers, to provide a simple way to manipulate a bunch of connection \
managers at once, to remove the need to have in each program the \
account definitions and credentials, to manage channel handling/request \
and to manage presence statuses."
LICENSE = "LGPL-2.1-only"

PV = "5.16.6"

RPM_NAME = "libmission-control-plugins0-5.16.6-1.10.aarch64.rpm"
RPM_HASH = "64402761446554de9d0d01fd3f4582fbdee9ed59e182c66134679ed081162829cae35cb31723c21f433b792abb41c2cef5002cc8d7cee6b1acbd22e7b9c46671"

RPROVIDES:${PN} += "libmission-control-plugins.so.0 \
libmission-control-plugins0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
