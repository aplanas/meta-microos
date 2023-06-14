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

RPM_NAME = "python39-cstruct-5.2-1.3.noarch.rpm"
RPM_HASH = "3bc7688abb2a7da43a4a0b0721f3ab550c41c7204bda0c1337db7669d531b1a86d38bc6bf3741ffdb7ce1711cf994c7425a347ae92181d0b8f39e5c024b56e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cstruct \
python39-cstruct \
python3dist-cstruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
