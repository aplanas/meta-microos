SUMMARY = "XFS Filesystem-specific Static Libraries and Headers"
DESCRIPTION = "xfsprogs-devel contains the libraries and header files needed to \
develop XFS file system-specific programs. \
 \
You should install xfsprogs-devel if you want to develop XFS file \
system-specific programs.  If you install xfsprogs-devel, you will also \
want to install xfsprogs."
LICENSE = "GPL-2.0-or-later"

PV = "6.3.0"

RPM_NAME = "xfsprogs-devel-6.3.0-1.1.aarch64.rpm"
RPM_HASH = "1668fa3275ef2b35b923d65daf6f680516d04e4c24f845652f440aa18acacb9504d32609b2ff4a3788ad2efc0014e7f2f36bec8d59ef10ab054084fd9e4e80c8"

RPROVIDES:${PN} += "xfsprogs-devel \
xfsprogs-devel(aarch-64)"
RDEPENDS:${PN} += "libhandle1 \
libuuid-devel \
xfsprogs"

inherit rpm
