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

RPM_NAME = "python311-cstruct-5.2-1.5.noarch.rpm"
RPM_HASH = "58b9ae758729f25885bed588ab973ca9c1354e4e45f2c68c8f60c0848dc01259057305993457191ee8ed788f03aed5effe6666bff89488d41fedaf26b4fd8f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cstruct \
python3.11dist-cstruct \
python311-cstruct \
python3dist-cstruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
