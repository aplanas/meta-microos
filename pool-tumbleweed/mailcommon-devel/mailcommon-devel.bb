SUMMARY = "Development package for mailcommon"
DESCRIPTION = "This package contains the development headers for the mailcommon library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "mailcommon-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4067a7f8a7df7ec8797a3824d52060fd6aa835cf599c7949ea5677f884355b04ddd291c1e301d041378c21bd07eae072ab9da61794c08dce3e741ea8d4da5b2f"

RPROVIDES:${PN} += "cmake-KF5MailCommon \
cmake-KPim5MailCommon \
mailcommon-devel"

RDEPENDS:${PN} += "cmake-KF5Completion \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiMime \
cmake-KPim5Libkdepim \
cmake-KPim5MessageCore \
cmake-KPim5PimCommon \
ld-linux-aarch64.so.1 \
libKPim5MailCommon.so.5 \
libKPim5MailCommon5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
