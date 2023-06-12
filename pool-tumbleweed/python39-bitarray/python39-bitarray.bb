SUMMARY = "Efficient Arrays of Booleans"
DESCRIPTION = "This module provides an object type which efficiently represents an \
array of booleans.  Bitarrays are sequence types and behave very \
much like usual lists. Eight bits are represented by one byte in a \
contiguous block of memory. The user can select between two \
representations; little-endian and big-endian. \
All of the functionality is implemented in C. Methods for accessing \
the machine representation are provided.  This can be useful when \
bit level access to binary files is required, such as portable \
bitmap image files (.pbm). \
Also, when dealing with compressed data which uses variable bit \
length encoding, you may find this module useful."
LICENSE = "Python-2.0"

PV = "2.7.3"

RPM_NAME = "python39-bitarray-2.7.3-1.4.aarch64.rpm"
RPM_HASH = "876e943edc18b2eaf8541a2040d3294525c9d8746e9abeef2decd13a8fcf44525e47d3fd482e8bdc7b06f677f35ec08fd077e3c9947605ea54b82b93890cd822"

RPROVIDES:${PN} += "python3.9dist(bitarray) \
python39-bitarray \
python39-bitarray(aarch-64) \
python3dist(bitarray)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
