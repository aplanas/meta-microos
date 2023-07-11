SUMMARY = "Development files for jsoncpp"
DESCRIPTION = "JSON is a lightweight data-interchange format. It can represent numbers, \
strings, ordered sequences of values, and collections of name/value pairs. \
 \
JsonCpp is a C++ library that allows manipulating JSON values, including \
serialization and deserialization to and from strings. It can also preserve \
existing comment in unserialization/serialization steps, making it a convenient \
format to store user input files."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "jsoncpp-devel-1.9.5-2.4.aarch64.rpm"
RPM_HASH = "f2f05c5266dc062d65f1c51ffe676b7293f2add0a7ec8b9ba1ae7e05cc7441927d07a53accbfc74aaec52728d0144d46ea0e01cf1874b75ceaff4f418a7e924d"

RPROVIDES:${PN} += "jsoncpp-devel \
pkgconfig-jsoncpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjsoncpp25"

inherit rpm
