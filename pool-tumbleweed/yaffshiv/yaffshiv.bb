SUMMARY = "A YAFFS file system parser and extractor"
DESCRIPTION = "A YAFFS file system parser and extractor writte in pure python. \
 \
Features: \
 - List and/or extract regular files, folders, symlinks, hard \
   links, and special device files \
 - Automatic detection and/or brute force of YAFFS build parameters \
   (page size, spare size, endianess, etc) \
 - Support for both big and little endian YAFFS file systems"
LICENSE = "MIT"

PV = "0.1+git.20160105"

RPM_NAME = "yaffshiv-0.1+git.20160105-1.10.noarch.rpm"
RPM_HASH = "7e8972e56f3fef34eacde30d64191f86c8569a27b26b1a847cebae1c8ada4574665c602b1eb943f453b09de61d4c337e89e23e111de6c9d8bfb7b963b397a95c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-yaffshiv \
python3dist-yaffshiv \
yaffshiv"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
