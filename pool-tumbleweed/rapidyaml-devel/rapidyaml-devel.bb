SUMMARY = "Header files for rapidyaml, a library to parse and emit YAML"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML. \
 \
This package contains development headers and examples."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "rapidyaml-devel-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "8f5c2ea1577c3dc03aa73232cc36563882985b0debaf1a6aa59a753e9eb4d137452c625554f7f5085510f3f11376418e4d0c7b8fdb85a58d384a5e56fb1c32ce"

RPROVIDES:${PN} += "cmake-c4core \
cmake-ryml \
rapidyaml-devel"

RDEPENDS:${PN} += "libc4core0-1-11 \
libryml0-5-0"

inherit rpm
