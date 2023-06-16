SUMMARY = "Frontend for compressing and uncompressing"
DESCRIPTION = "Z is a frontend for the compress/uncompress, gzip, bzip2, tar, and zip/unzip \
utilities to compress and uncompress files and directories."
LICENSE = "GPL-2.0-only"

PV = "2.7.3"

RPM_NAME = "z-2.7.3-1.8.noarch.rpm"
RPM_HASH = "2d9604a163fb0815884e2ceb5691580b625fccdc5e7e4fce266fa3992007e1a7dcefbed691090469a81d08a0f9ee9c3f3ddc48fcd16c3caac5a56cbfa341de80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "z"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
