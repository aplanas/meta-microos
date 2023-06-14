SUMMARY = "Devel package for ZArchive"
DESCRIPTION = "This subpackage contains the devel files for ZArchive"
LICENSE = "MIT-0"

PV = "0.1.2+git20220908.d2c7177"

RPM_NAME = "ZArchive-devel-0.1.2+git20220908.d2c7177-3.1.aarch64.rpm"
RPM_HASH = "cd18004e53a73093b92e949cdd26c9e335d26194944fa0534404b758f47362d594c33c16a40c8fc1bcecc83953284a8cf036e2def474035b8700f974c2141a02"

RPROVIDES:${PN} += "ZArchive-devel \
pkgconfig-zarchive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzarchive0-1 \
pkgconfig-libzstd"

inherit rpm
