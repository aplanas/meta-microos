SUMMARY = "Icinga 2 binaries and libraries"
DESCRIPTION = "Icinga 2 is a general-purpose network monitoring application. \
This subpackage provides the binaries for Icinga 2 Core."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-bin-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "8d2693fef16b7c37dae10e02d939407c6ecb97fe813ea6fe54aaafffaabc9258b3a44380d8a6fcd0279ca9ebd10a2ab4e4b227ea0b2cbc0371fb02df33359160"

RPROVIDES:${PN} += "icinga2-bin \
icinga2-libs \
monitoring-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-context.so.1.82.0 \
libboost-coroutine.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
systemd"

inherit rpm
