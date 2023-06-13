SUMMARY = "Development headers for Boost.ProgramOptions library"
DESCRIPTION = "This package contains development headers for Boost.ProgramOptions \
library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_program_options1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "7efb9a73aa23ebf8cc7274114e73f5dd40b61e033f20aacf7c23eefd6306cac4df35252b03e9ba284efa6434bf2a2b1bae03acb209419aae6b5f0ce9ba0fa295"

RPROVIDES:${PN} += "libboost_program_options-devel-impl \
libboost_program_options1_82_0-devel \
libboost_program_options1_82_0-devel(aarch-64)"

RDEPENDS:${PN} += "libboost_headers1_82_0-devel \
libboost_program_options1_82_0"

inherit rpm
