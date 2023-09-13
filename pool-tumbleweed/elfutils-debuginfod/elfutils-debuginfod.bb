SUMMARY = "Debuginfod server provided by elfutils"
DESCRIPTION = "The elfutils-debuginfod package contains the debuginfod binary \
and control files for a service that can provide ELF/DWARF \
files to remote clients, based on build-id identification. \
The ELF/DWARF file searching functions in libdwfl can query \
such servers to download those files on demand."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-debuginfod-0.189-5.1.aarch64.rpm"
RPM_HASH = "d9d422281fc80554334936186618cf90205b44906a3817ffdf228bc0733621662f9da57e86b035a8dc316ede2042356ecfda9c1e46c7b1616d014efa84db08b6"

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
