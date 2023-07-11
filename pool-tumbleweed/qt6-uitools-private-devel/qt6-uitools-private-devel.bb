SUMMARY = "Non-ABI stable API for the Qt 6 UiTools library"
DESCRIPTION = "This package provides private headers of libQt6UiTools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-uitools-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5a282ee14abfcc04c99641e437513248db19515861e023d414fe0df0e909fc03b082be29c931707ae2d4cb95ea5c3f41b5eca7c9022799916300a350532baf3b"

RPROVIDES:${PN} += "qt6-uitools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6UiTools"

inherit rpm
