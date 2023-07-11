SUMMARY = "Debuginfod server provided by elfutils"
DESCRIPTION = "The elfutils-debuginfod package contains the debuginfod binary \
and control files for a service that can provide ELF/DWARF \
files to remote clients, based on build-id identification. \
The ELF/DWARF file searching functions in libdwfl can query \
such servers to download those files on demand."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-debuginfod-0.189-3.2.aarch64.rpm"
RPM_HASH = "28362f66d4d8bf0264547e5a578aa13971256701ccb143c4c165c43577af6b7c586ef5f3899d1b30a6bdc4b9a35dcc45cc1d105cd7b6347a2dce2c5505caff8f"

RPROVIDES:${PN} += "elfutils-debuginfod \
group-debuginfod \
user-debuginfod"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
debuginfod-client \
elfutils \
fillup \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libmicrohttpd.so.12 \
libsqlite3.so.0 \
libstdc++.so.6 \
sysuser-shadow"

inherit rpm
