SUMMARY = "Debuginfod server provided by elfutils"
DESCRIPTION = "The elfutils-debuginfod package contains the debuginfod binary \
and control files for a service that can provide ELF/DWARF \
files to remote clients, based on build-id identification. \
The ELF/DWARF file searching functions in libdwfl can query \
such servers to download those files on demand."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-debuginfod-0.189-4.1.aarch64.rpm"
RPM_HASH = "8babb0ddf472667517f0fb802f055c47a29f483d39a6f47afb3c820a6102d2e3ae534b35ef9add903eb148a3e8acfbffc81941d4087ace81507a55cd1bc0573d"

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
