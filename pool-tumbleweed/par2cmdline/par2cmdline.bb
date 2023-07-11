SUMMARY = "A PAR 2.0 compatible file creation, verification, and repair tool"
DESCRIPTION = "par2cmdline is a program for creating and using PAR2 files to detect damage in \
data files and repair them if necessary. It can be used with any kind of file."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.1"

RPM_NAME = "par2cmdline-0.8.1-2.12.aarch64.rpm"
RPM_HASH = "c9e79996b761e3ef2120eb5ede35d6eec7b3e7c73cf5f6b0bb384da98c01b8c3d8e83ab529fad0fb482e0d20e591edab91389c7eabe78fa6c659efd45003ba0e"

RPROVIDES:${PN} += "par \
par2 \
par2cmdline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6"

inherit rpm
