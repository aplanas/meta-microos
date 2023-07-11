SUMMARY = "XFS Filesystem-specific Static Libraries and Headers"
DESCRIPTION = "xfsprogs-devel contains the libraries and header files needed to \
develop XFS file system-specific programs. \
 \
You should install xfsprogs-devel if you want to develop XFS file \
system-specific programs.  If you install xfsprogs-devel, you will also \
want to install xfsprogs."
LICENSE = "GPL-2.0-or-later"

PV = "6.3.0"

RPM_NAME = "xfsprogs-devel-6.3.0-1.2.aarch64.rpm"
RPM_HASH = "6eb3f3cbbbf1fa543063d070c3e56adc662802e9d4259ef182f14f719f900281d1e7a39eca21370a49dafb06024bca6ba860532d2618c294178c07431972a3c4"

RPROVIDES:${PN} += "xfsprogs-devel"

RDEPENDS:${PN} += "libhandle1 \
libuuid-devel \
xfsprogs"

inherit rpm
