SUMMARY = "Performance Co-Pilot (PCP) development headers"
DESCRIPTION = "Performance Co-Pilot (PCP) headers for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp-devel-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "93371a3366af1e7e8ca5e01a82302574d545b021bc4e4cc37a99443b7557aa158493dd2c0c210312226ebfa39dcbdcff53eb126ee7ecca17727ba9fc046acaea"

RPROVIDES:${PN} += "libpcp-devel \
pcp-devel \
pkgconfig-libpcp \
pkgconfig-libpcp-import \
pkgconfig-libpcp-pmda"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcp-gui2 \
libpcp3"

inherit rpm
