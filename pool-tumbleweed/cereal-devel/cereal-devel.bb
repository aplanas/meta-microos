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

RPM_NAME = "cereal-devel-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "04e6b33be31a6674c02609439c4c0a09efb63399c6329386ffa80220e8197689fd7a12ea674c8b3ad7f23ce0625e13571755aec2345d8e424efbc0c89d0d9bd2"

RPROVIDES:${PN} += "cereal-devel \
cmake-cereal"

RDEPENDS:${PN} += ""

inherit rpm
