SUMMARY = "Development package for mailimporter"
DESCRIPTION = "This package provides the development headers of the mailimporter library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "mailimporter-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a69c629b715fd8db86609b9f0c000f0e4a1f42d3c7689463f86ccd40721cd9d72ed5172ee0640c4b3bcf6c46d8f3f8afb3146b7ca098df1ecd757c583969bc2c"

RPROVIDES:${PN} += "cmake-KF5MailImporter \
cmake-KF5MailImporterAkonadi \
cmake-KPim5MailImporter \
cmake-KPim5MailImporterAkonadi \
mailimporter-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
libKPim5MailImporter5 \
libKPim5MailImporterAkonadi5"

inherit rpm
