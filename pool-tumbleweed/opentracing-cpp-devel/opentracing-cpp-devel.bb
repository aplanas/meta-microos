SUMMARY = "Development files for the OpenTracing C++ API"
DESCRIPTION = "Development files for opentracing-cpp - the C++ implementation of the \
OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "opentracing-cpp-devel-1.6.0-1.10.aarch64.rpm"
RPM_HASH = "42010407ce96f81f0c7eab2308f124f89f03255cfb29f596488a89aabfc88dff5f66d80a2034ed39facccde7552dc7c007836953b6ee64b5d9db31da33857a0d"

RPROVIDES:${PN} += "opentracing-cpp-devel"

RDEPENDS:${PN} += "libopentracing-cpp1"

inherit rpm
