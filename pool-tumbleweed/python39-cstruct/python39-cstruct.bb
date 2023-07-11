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

RPM_NAME = "python39-cstruct-5.2-1.5.noarch.rpm"
RPM_HASH = "e3793ffaeb4cb0db325d80935a3d039de45c2ce39586ad065e97ac8d6535aaeff793f3612386077730b6fe01dc8b7d4aa4bb47fe378391efbf5295d02c28ac56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cstruct \
python39-cstruct \
python3dist-cstruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
