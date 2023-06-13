SUMMARY = "Debuginfod server provided by elfutils"
DESCRIPTION = "The elfutils-debuginfod package contains the debuginfod binary \
and control files for a service that can provide ELF/DWARF \
files to remote clients, based on build-id identification. \
The ELF/DWARF file searching functions in libdwfl can query \
such servers to download those files on demand."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-debuginfod-0.189-3.1.aarch64.rpm"
RPM_HASH = "66a46eacfadeeb096fb4b43505a453c9d87ff1b6fcaeb8a5e66c2bd7beb768b61b38b0d3e05d65bb58c4bbaaec7fcbdaea8a6f9057165a1880594aff099c1027"

RPROVIDES:${PN} += "elfutils-debuginfod \
elfutils-debuginfod(aarch-64) \
group(debuginfod) \
user(debuginfod)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
debuginfod-client \
elfutils \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libdebuginfod.so.1()(64bit) \
libdw.so.1()(64bit) \
libelf.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libmicrohttpd.so.12()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
sysuser-shadow"

inherit rpm
