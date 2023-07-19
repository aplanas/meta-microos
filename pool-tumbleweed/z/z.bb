SUMMARY = "Frontend for compressing and uncompressing"
DESCRIPTION = "Z is a frontend for the compress/uncompress, gzip, bzip2, tar, and zip/unzip \
utilities to compress and uncompress files and directories."
LICENSE = "GPL-2.0-only"

PV = "2.7.4"

RPM_NAME = "z-2.7.4-1.1.noarch.rpm"
RPM_HASH = "a3302d7753509fff3af1d144fef3501453137b55eb38edc13edf6d51424c81f8d8cc491bec0f9157ddc54d61ff2887775c23f24ea4a082792e71f485245d4c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "z"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
