SUMMARY = "Tools to create, extract, modify, and mount WIM files"
DESCRIPTION = "Tools to create, extract, modify, and mount files in the Windows Imaging Format \
(WIM files).  These files are normally created by using the `imagex.exe' utility \
on Windows, but this package contains an implementation of ImageX called \
'wimlib-imagex'."
LICENSE = "CC0-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.13.6"

RPM_NAME = "wimtools-1.13.6-1.4.aarch64.rpm"
RPM_HASH = "3930e3190b91618636223f9a17643d8df5f8fed8ebfbf17dc1b5aaf22458d681f62c4b6bbcb8b9b38fb575aa59b9d3ee9ad59574ed66011804a7598920ac1e5f"

RPROVIDES:${PN} += "wimtools \
wimtools(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libwim.so.15()(64bit)"

inherit rpm
