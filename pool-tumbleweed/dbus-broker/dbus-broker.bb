SUMMARY = "XDG-conforming message bus implementation"
DESCRIPTION = "dbus-broker is an implementation of a message bus as defined by the \
D-Bus specification. It has some different characteristics/features \
from classic D-Bus: \
 \
* No shared medium \
* No IPC to implement IPC \
* User-based accounting \
* Reliable messages \
* Just the bus implementation, no external communication \
* Local only, no remote transport \
* Support for SASL pipelining \
* Runtime broker control"
LICENSE = "Apache-2.0"

PV = "33"

RPM_NAME = "dbus-broker-33-1.4.aarch64.rpm"
RPM_HASH = "fa32861137c8408df2880b9bdfca6938856e72538db838619fb55a63ae58dead50f3d31d58f222b914951e15b73999e4ec2516f35388799dd231a1fcf754de02"

RPROVIDES:${PN} += "bundled-c-dvar \
bundled-c-ini \
bundled-c-list \
bundled-c-rbtree \
bundled-c-shquote \
bundled-c-stdaux \
bundled-c-utf8 \
dbus-broker \
dbus-service"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libexpat.so.1 \
libm.so.6 \
libselinux.so.1 \
libsystemd.so.0"

inherit rpm
