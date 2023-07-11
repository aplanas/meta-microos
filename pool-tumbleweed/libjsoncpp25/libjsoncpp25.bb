SUMMARY = "Shared library for jsoncpp"
DESCRIPTION = "JSON is a lightweight data-interchange format. It can represent numbers, \
strings, ordered sequences of values, and collections of name/value pairs. \
 \
JsonCpp is a C++ library that allows manipulating JSON values, including \
serialization and deserialization to and from strings. It can also preserve \
existing comment in unserialization/serialization steps, making it a convenient \
format to store user input files."
LICENSE = "MIT"

PV = "1.9.5"

RPM_NAME = "libjsoncpp25-1.9.5-2.4.aarch64.rpm"
RPM_HASH = "75b2a30e4743737625e2c9e3758ce0533cc884e987cd5cf62cfdab5b7b6bef8f322f4e76e3930274da1817b03885112ce4b363ac470e7675fe7a76f80a390cf8"

RPROVIDES:${PN} += "libjsoncpp.so.25 \
libjsoncpp25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
