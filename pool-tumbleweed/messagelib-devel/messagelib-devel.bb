SUMMARY = "Library for messages"
DESCRIPTION = "This package contains source headers for messagelib."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "messagelib-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bdfa04b98289646bb4e0b422a24a6c8e49e99e88474354df00d2cbb2c95081791fddd47f01754552703bafb763640292390b7cc986a1c586b20a087073d67456"

RPROVIDES:${PN} += "cmake-KPim5MessageComposer \
cmake-KPim5MessageCore \
cmake-KPim5MessageList \
cmake-KPim5MessageViewer \
cmake-KPim5MimeTreeParser \
cmake-KPim5TemplateParser \
cmake-KPim5WebEngineViewer \
messagelib-devel"

RDEPENDS:${PN} += "cmake-KF5Contacts \
cmake-KF5Libkleo \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiMime \
cmake-KPim5IdentityManagement \
cmake-KPim5Mime \
cmake-KPim5PimCommon \
cmake-Qt5WebEngineWidgets \
messagelib"

inherit rpm
