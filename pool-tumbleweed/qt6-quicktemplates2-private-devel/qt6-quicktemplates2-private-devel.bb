SUMMARY = "Non-ABI stable API for the Qt 6 QuickTemplates2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickTemplates2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktemplates2-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "7efd5ff5fb56a2d82fa55aca18d5c195dfed08e7548d064ca4fefc43d59a498d65fa49bb051f5dec7efa617828dcca64a76e6c5b4511f1f51723c7eec55363bf"

RPROVIDES:${PN} += "qt6-quicktemplates2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTemplates2"

inherit rpm
