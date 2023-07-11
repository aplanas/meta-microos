SUMMARY = "Documentation of gcovr"
DESCRIPTION = "Gcovr provides a utility for managing the use of the GNU gcov utility \
and generating summarized code coverage results. \
 \
This package contains the documentation of gcovr."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "gcovr-doc-5.2-1.3.noarch.rpm"
RPM_HASH = "00e245417ad82dd9c1d9f98e72243aed8966cce5cf49d80e156f37ca6b5e1030ff1c62a33a8f626b33f7048f48114c4028d1c80b2578f866ec61e6e31f3cc583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcovr-doc"

RDEPENDS:${PN} += ""

inherit rpm
