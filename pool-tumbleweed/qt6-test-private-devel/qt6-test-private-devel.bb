SUMMARY = "Non-ABI stable API for the Qt 6 Test library"
DESCRIPTION = "This package provides private headers of libQt6Test that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-test-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "71aa050081ae7e03e3cd1d6f8ed62874eae1a4ae3db02770cb61b95d595f34a330b5af19398a346b93cc77373a902e67a6d6574ff139313d2a9856bc138a1f09"

RPROVIDES:${PN} += "qt6-test-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Test \
qt6-core-private-devel"

inherit rpm
