SUMMARY = "A free HEX editor / disk editor"
DESCRIPTION = "wxHexEditor is a hex editor that is capable of handling very large \
files. It supports files up to 2^64 bytes. It can also act as a \
disk editor. \
Features: \
 * Small footprint on RAM; \
 * Raw Disk Access (on POSIX systems); \
 * Does not create temporary files."
LICENSE = "GPL-2.0-only"

PV = "0.24"

RPM_NAME = "wxhexeditor-0.24-3.14.aarch64.rpm"
RPM_HASH = "ead9be342bea4be915055d9d2b626294f06bc976868ac8901f90682895502efa5c1d1404b93d847a4611e737ebbcc38e4dc12c9829b4ecff4dd21da64c74fe5a"

RPROVIDES:${PN} += "wxhexeditor"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmhash.so.2 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.3.0.5 \
libwx-baseu-suse.so.3.0.5 \
libwx-baseu-xml-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-aui-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
