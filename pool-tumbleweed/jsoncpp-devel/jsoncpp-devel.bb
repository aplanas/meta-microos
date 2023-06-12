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

RPM_NAME = "jsoncpp-devel-1.9.5-2.3.aarch64.rpm"
RPM_HASH = "4df7d654d48331240513a6df821a4159d30a65f3e809b6c511ed68f8170d4101ac59b099797603bb653cf51bfe73a866f112c512773c02b30fd69c431fb6a339"

RPROVIDES:${PN} += "jsoncpp-devel \
jsoncpp-devel(aarch-64) \
pkgconfig(jsoncpp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjsoncpp25"

inherit rpm
