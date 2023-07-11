SUMMARY = "Tools to create, extract, modify, and mount WIM files"
DESCRIPTION = "Tools to create, extract, modify, and mount files in the Windows Imaging Format \
(WIM files).  These files are normally created by using the `imagex.exe' utility \
on Windows, but this package contains an implementation of ImageX called \
'wimlib-imagex'."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.14.1"

RPM_NAME = "wimtools-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "59c78dd4becfe29c0c2323aafbe8ee7d804de9822ce5c53f1a396377247ddfaf81185c096fdbe03e4230cd9574a614673e1e1f9be4e170c1f13a2bc5ab9e7b37"

RPROVIDES:${PN} += "wimtools"

RDEPENDS:${PN} += "/usr/bin/bash \
fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwim.so.15"

inherit rpm
