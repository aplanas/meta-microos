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

PV = "2.8.1"

RPM_NAME = "python310-bitarray-2.8.1-1.1.aarch64.rpm"
RPM_HASH = "8dc49c450b35030a9ac6167b520c903bad48a173d1cba113d8535b5d841eb503a5393da45b8a2fc9c60ecc58b322fed1f595b6b96405d1767d084d6b6f1a5407"

RPROVIDES:${PN} += "python3.10dist-bitarray \
python310-bitarray \
python3dist-bitarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
