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

RPM_NAME = "python311-cstruct-5.2-1.3.noarch.rpm"
RPM_HASH = "993b7f26400e6a2b401cd354d0eefcbc13363ce8773b0253f212ebc2d9dfdd8fa520d4d71d50df8ce11ca79ec2240ba9e169e072ba3991cc324cdcf20c4a761d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cstruct \
python311-cstruct \
python3dist-cstruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
