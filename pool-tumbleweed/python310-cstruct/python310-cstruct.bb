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

RPM_NAME = "python310-cstruct-5.2-1.5.noarch.rpm"
RPM_HASH = "efa00da8b805259b4f812e6d4166ada2e3f2d9cae2716e2fe5027545468fd57a08e19be74e23b737bcf7a90d9e57312eb92600463607642ffb55dc25a92d6df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cstruct \
python310-cstruct \
python3dist-cstruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
