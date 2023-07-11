SUMMARY = "Development files for the GTP library"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgtp."
LICENSE = "GPL-2.0-only"

PV = "1.10.1"

RPM_NAME = "libgtp-devel-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "6d2c3f1d5637faa6b4b14b39cd1e811c64bafadd51cc8081446a8bf0189ed3d5cd3e1d0798b83bb1a988b32c335a7f73d1c12394b90661e666f6cb3e7ce3e126"

RPROVIDES:${PN} += "libgtp-devel \
pkgconfig-libgtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtp6"

inherit rpm
