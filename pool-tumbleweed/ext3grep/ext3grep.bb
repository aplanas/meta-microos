SUMMARY = "A tool to possibly recover deleted content on ext3 file systems"
DESCRIPTION = "A tool to investigate an ext3 file system for deleted content and possibly recover it. \
 \
Also see http://www.xs4all.nl/~carlo17/howto/undelete_ext3.html"
LICENSE = "GPL-2.0-only"

PV = "0.10.2"

RPM_NAME = "ext3grep-0.10.2-9.18.aarch64.rpm"
RPM_HASH = "1cd6def3f3c7a227ac17b39dc8b96126939bf425e64adf5fa61aeb7f95a0e37152c92f0c255a8817f1d1a35a1224755549d547de4df9da823ffbd46f8f77bffe"

RPROVIDES:${PN} += "ext3grep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
