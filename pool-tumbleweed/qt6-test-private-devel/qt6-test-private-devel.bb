SUMMARY = "Non-ABI stable API for the Qt 6 Test library"
DESCRIPTION = "This package provides private headers of libQt6Test that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-test-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "10dcf9943bec25e466f16041d7393476f309f3965400a24cace89db239849ec18bf413fdc3ca3c85ed5343091f6931711255f80bbe8f4d021fed2ef5d92f7c93"

RPROVIDES:${PN} += "qt6-test-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Test \
qt6-core-private-devel"

inherit rpm
