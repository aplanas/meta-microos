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

RPM_NAME = "python310-bitarray-2.7.3-1.4.aarch64.rpm"
RPM_HASH = "eb97959370b88c68ebdffbc10ff817210839bc320cb05f267732780ae3bd34c968162c80482c27a25462db54552fb681651bb91c68fdfb7a57070fb6c5a41834"

RPROVIDES:${PN} += "python3-bitarray \
python3.10dist(bitarray) \
python310-bitarray \
python310-bitarray(aarch-64) \
python3dist(bitarray)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
