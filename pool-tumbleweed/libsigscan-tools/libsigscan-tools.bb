SUMMARY = "Tools to scan for binary signatures"
DESCRIPTION = "Tools to scan binary files for signatures."
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan-tools-20230109-2.1.aarch64.rpm"
RPM_HASH = "299efdeb34f5098c3dfa6cbc37b5afd8622dd2974bcafc1607da482a0a2f37117e16783ad8f323c5c5285b428f1594017521d1f36c3dce647d6c96dfa4e46293"

RPROVIDES:${PN} += "config-libsigscan-tools \
libsigscan-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsigscan.so.1 \
libsigscan1"

inherit rpm
