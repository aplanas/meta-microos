SUMMARY = "Development package for mailimporter"
DESCRIPTION = "This package provides the development headers of the mailimporter library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "mailimporter-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3d72b683ba7083edc060238b6abc05ab347891b83d51083b117c728f3622d0c27a8b6090769890aa72613fda69574f8d5bd550b3f47eeda52a1eee2c93a3e144"

RPROVIDES:${PN} += "cmake-KPim5MailImporter \
cmake-KPim5MailImporterAkonadi \
mailimporter-devel"

RDEPENDS:${PN} += "cmake-KF5Archive \
libKPim5MailImporter5 \
libKPim5MailImporterAkonadi5"

inherit rpm
