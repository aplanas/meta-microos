SUMMARY = "Documentation of gcovr"
DESCRIPTION = "Gcovr provides a utility for managing the use of the GNU gcov utility \
and generating summarized code coverage results. \
 \
This package contains the documentation of gcovr."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "gcovr-doc-5.2-1.2.noarch.rpm"
RPM_HASH = "0c73aa68b3756e0fe32fbae78f1cbd9258751688551294bbd2c0a79b3ec621895874b118308f8e50397632e191e5550b250f5f50378a5b49a57ae52d6076d15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcovr-doc"
RDEPENDS:${PN} += ""

inherit rpm
