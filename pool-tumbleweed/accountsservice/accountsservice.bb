SUMMARY = "D-Bus Service to Manipulate User Account Information"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
The implementation is based on the useradd, usermod and userdel \
commands."
LICENSE = "GPL-3.0-or-later"

PV = "22.08.8"

RPM_NAME = "accountsservice-22.08.8-2.4.aarch64.rpm"
RPM_HASH = "a9e55aaab6f62370503bdf070ea7f1c29eab5417874c1fab15bd7e4c86462d79a7cbb79028f7255d30609d0a079027cd4b176d8254ded237ff75f0aea7c152c3"

RPROVIDES:${PN} += "accountsservice \
accountsservice(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit)"

inherit rpm
