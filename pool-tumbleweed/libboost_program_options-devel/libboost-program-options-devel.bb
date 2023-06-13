SUMMARY = "Development headers for Boost.ProgramOptions library"
DESCRIPTION = "This package contains development headers for Boost.ProgramOptions \
library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_program_options-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "94fec30834b9a0ed970e114e56dd7c458dd963e69a14e65fa5a78cc14374c48273f9695a2072cf873cf9bd2303bad3f2e75e3fb0982811e508386ac71196a2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_program_options-devel"

RDEPENDS:${PN} += "libboost_program_options1_82_0-devel"

inherit rpm
