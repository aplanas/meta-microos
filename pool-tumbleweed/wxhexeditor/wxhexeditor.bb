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

RPM_NAME = "wxhexeditor-0.24-3.15.aarch64.rpm"
RPM_HASH = "8dd81d4ce7fb90c6b81ddb1c5ed44987268788f8de69dd6e84f7ba0e7ccaddf45ce01b3be18947f3abd02e8477c0589452a22058ab7487a31908912c88c7a93b"

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
