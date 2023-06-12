SUMMARY = "Development files for libptytty"
DESCRIPTION = "libptytty is an offspring of rxvt-unicode that handles \
pty/tty/utmp/wtmp/lastlog handling in mostly OS-independent ways. \
 \
This package contains the libptytty development files."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "libptytty-devel-2.0-2.7.aarch64.rpm"
RPM_HASH = "e8ea0298ad768805a21063334e39e3805ed5dca1d40cedbd1f8689f35d0097faa7d44a30cd2fc24884125e75a36d8960b060c712e7ff2aeb8e9426e4211f702b"

RPROVIDES:${PN} += "libptytty-devel \
libptytty-devel(aarch-64) \
pkgconfig(libptytty)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptytty0"

inherit rpm
