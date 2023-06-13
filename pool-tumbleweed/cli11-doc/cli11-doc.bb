SUMMARY = "Documentation for CLI11"
DESCRIPTION = "This package contains documentation for CLI11 \
 \
CLI11 is a command line parser for C++11 and beyond that provides a \
rich feature set. It is header only, and has a number of design \
limits by choice: \
 \
 * No completion of partial options (like --ve for --version, \
   if it were unambiguous) \
 * No wide strings/Unicode"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "cli11-doc-2.3.2-1.2.noarch.rpm"
RPM_HASH = "427cb025acb0aa61b477f23c6328f953c7f6cdef6c7991994cd52d3128d5bebf77aeec21acb3e03ee25016d69df869c518bcd28b98c1eeda4ea1e4eea735b970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cli11-doc"

RDEPENDS:${PN} += ""

inherit rpm
