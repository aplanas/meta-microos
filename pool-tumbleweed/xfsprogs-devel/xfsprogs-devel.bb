SUMMARY = "XFS Filesystem-specific Static Libraries and Headers"
DESCRIPTION = "xfsprogs-devel contains the libraries and header files needed to \
develop XFS file system-specific programs. \
 \
You should install xfsprogs-devel if you want to develop XFS file \
system-specific programs.  If you install xfsprogs-devel, you will also \
want to install xfsprogs."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "xfsprogs-devel-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "e030f0c2c73d82d56cee7bed0bc4089a94c2a76f10adc213c57c12e4eb5694bbc7d8b7c50789e6d3047d7369aab62ab8ecb3be3045feebc97ed16c22697aded0"

RPROVIDES:${PN} += "xfsprogs-devel"

RDEPENDS:${PN} += "libhandle1 \
libuuid-devel \
xfsprogs"

inherit rpm
