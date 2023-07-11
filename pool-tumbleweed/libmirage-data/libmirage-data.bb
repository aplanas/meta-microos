SUMMARY = "MIME type definitions and documentation for libmirage"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains the MIME type definitions and documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-data-3.2.6-1.9.noarch.rpm"
RPM_HASH = "6c27444c27bb7452f20d444ed44ab361281c80079b3bfad21509fb9f6c1daa1ae88b3c507ddebd0b5c0c55e6aff4a82411d8bfbd55c408ed89f7e3f776f6e7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-data"

RDEPENDS:${PN} += "/usr/bin/sh \
shared-mime-info"

inherit rpm
