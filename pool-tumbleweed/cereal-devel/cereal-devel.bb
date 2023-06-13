SUMMARY = "Development headers and libraries for cereal library"
DESCRIPTION = "cereal is a header-only C++11 serialization library. cereal takes arbitrary \
data types and reversibly turns them into different representations, such as \
compact binary encodings, XML, or JSON. cereal was designed to be fast, \
light-weight, and easy to extend - it has no external dependencies and can be \
easily bundled with other code or used standalone. \
 \
This package contains development headers and libraries for the cereal library"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "cereal-devel-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "08d0b009524974c56e02bc44f678f2294bda59c18bdc84c052f4af30baeed329fa4b25421abb19b3e457feace81841f3faee7935c9298298c78dcbd3b6e6ce5f"

RPROVIDES:${PN} += "cereal-devel \
cereal-devel(aarch-64) \
cmake(cereal)"

RDEPENDS:${PN} += ""

inherit rpm
