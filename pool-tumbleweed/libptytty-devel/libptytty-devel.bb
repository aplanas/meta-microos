SUMMARY = "Development files for libptytty"
DESCRIPTION = "libptytty is an offspring of rxvt-unicode that handles \
pty/tty/utmp/wtmp/lastlog handling in mostly OS-independent ways. \
 \
This package contains the libptytty development files."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "libptytty-devel-2.0-2.8.aarch64.rpm"
RPM_HASH = "53dfcec1fa55c78e0ca93ce6f6e5cbfcfbc402f0f4cd4a7a79c14828f2f20dfa2eb045d5d8b0af50f09c124c0999ee886dfee43c116f237fc95ca4ac73c299d6"

RPROVIDES:${PN} += "libptytty-devel \
pkgconfig-libptytty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptytty0"

inherit rpm
