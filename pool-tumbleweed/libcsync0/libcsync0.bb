SUMMARY = "A user level bidirectional client only file synchronizer"
DESCRIPTION = "csync is an implementation of a file synchronizer which provides the \
feature of roaming home directories for Linux clients. csync makes use \
of libsmbclient in Samba/Windows environments."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync0-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "f4553482a87b7f041eb00d7670ec1860c677b9c3b8ca76f927ceaa125d86490b0ca3b1df133a4df20a31cc8e8eb55152be7e97d8b4d55fbb7d964f362178e1aa"

RPROVIDES:${PN} += "config(libcsync0) \
libcsync.so.0()(64bit) \
libcsync0 \
libcsync0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
