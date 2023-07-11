SUMMARY = "Development package for mailcommon"
DESCRIPTION = "This package contains the development headers for the mailcommon library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "mailcommon-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d35279a3c4be64812ba083f7f7ddece31cdec6b3256875f6f5d63baf68ee993f603aadfd5a095da42b9ceedd9f74d77a7a4fb51bbe63f052e8c0d44b39213999"

RPROVIDES:${PN} += "cmake-KF5MailCommon \
cmake-KPim5MailCommon \
mailcommon-devel"

RDEPENDS:${PN} += "cmake-KF5Completion \
cmake-KF5PimCommon \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiMime \
cmake-KPim5Libkdepim \
cmake-KPim5MessageCore \
ld-linux-aarch64.so.1 \
libKPim5MailCommon.so.5 \
libKPim5MailCommon5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
