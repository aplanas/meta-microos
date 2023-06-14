SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_qa-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "f0fa2c6546a215c2b71da949c0373f6c2b8af87ad3bd1b82f28051d251d56fe5663cfeb69e71ed432ba4e86e4f5663e449177cbd869bc41b3207d47a34b39c26"

RPROVIDES:${PN} += "libwx-gtk2u-qa-suse.so.3.0.5 \
libwx-gtk2u-qa-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-baseu-xml-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
