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

RPM_NAME = "libjsoncpp25-1.9.5-2.3.aarch64.rpm"
RPM_HASH = "ee877aadb097f93ff8272a7d12ee4b3f6c828aff20f02515d73594d5de03ee8761d06dfa2902a3289613c30e0d9146e2d9448a98876f1e60588bf2d6e141a3dc"

RPROVIDES:${PN} += "libjsoncpp.so.25 \
libjsoncpp25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
