SUMMARY = "Library for messages"
DESCRIPTION = "This package contains source headers for messagelib."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "messagelib-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d408a8624a7a361b0a41073972c30a02b21f406330b9aea9c1b5db84e877cf586d812b0db759d45799c17e2a53775c0ec2a619e545f62583671b8566f99a1f83"

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
cmake-KF5PimCommon \
cmake-KPim5Akonadi \
cmake-KPim5AkonadiMime \
cmake-KPim5IdentityManagement \
cmake-KPim5Mime \
cmake-Qt5WebEngineWidgets \
messagelib"

inherit rpm
