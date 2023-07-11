SUMMARY = "Development files for sql-parser"
DESCRIPTION = "A SQL Parser for C++. It parses the given SQL query into C++ objects. It has \
been developed for integration in Hyrise, but can be used perfectly well in \
other environments as well. \
 \
This package contains development files for sql-parser."
LICENSE = "MIT"

PV = "1.5+git20181206"

RPM_NAME = "sql-parser-devel-1.5+git20181206-2.13.aarch64.rpm"
RPM_HASH = "c5327067ceb2d7cd15ef7da2e07ffc3a3fafb45d36cf70cbea0379c83e6101053f7cf79039e1884c0593f937e599723cdf1cac1b86b9160d0cbbe9d08c634dd4"

RPROVIDES:${PN} += "sql-parser-devel"

RDEPENDS:${PN} += "libsqlparser1"

inherit rpm
