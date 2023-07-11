SUMMARY = "Non-ABI stable API for the Qt 6 Test library"
DESCRIPTION = "This package provides private headers of libQt6Test that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-test-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "4e5369f34373438f2cdf68cc1d751aca235ba50eb12608601894bb1ad5123fbbca86f668ce5b0ac4412a7ee2fb20b527376b85a0a7674587e8381378569f08d9"

RPROVIDES:${PN} += "qt6-test-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Test \
qt6-core-private-devel"

inherit rpm
