SUMMARY = "C-style structs for Python"
DESCRIPTION = "Convert C struct definitions into Python classes with methods for \
serializing/deserializing. The usage is very simple: create a class \
subclassing cstruct.CStruct and add a C struct definition as a \
string in the struct field. The C struct definition is parsed at \
runtime and the struct format string is generated. The class offers \
the method 'unpack' for deserializing a string of bytes into a \
Python object and the method 'pack' for serializing the values into \
a string."
LICENSE = "MIT"

PV = "5.2"

RPM_NAME = "python310-cstruct-5.2-1.3.noarch.rpm"
RPM_HASH = "5db15bea1e819e8fb7d1c893932fe792eaca6d3e418f7be97e1610fed33f88356ec4d3878ad9e3af58469e9f6567afa5d7d7cfd9eda6132166932ad418680fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cstruct \
python3.10dist(cstruct) \
python310-cstruct \
python3dist(cstruct)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
