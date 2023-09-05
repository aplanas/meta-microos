SUMMARY = "Development package for libkioarchive5"
DESCRIPTION = "This is the development package for libkioarchive"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkioarchive-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "31db2803bdac682a3f1ae5e7fcae57ca3d72c5252c2d9e77bf4cd279e8d5721b7806021e73b0b9ec5ea30a45c05853a6d274247d67361d754fb679dab1af5df6"

RPROVIDES:${PN} += "cmake-KioArchive \
libkioarchive-devel"

RDEPENDS:${PN} += "libkioarchive5"

inherit rpm
