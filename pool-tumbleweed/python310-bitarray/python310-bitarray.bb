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

PV = "2.7.6"

RPM_NAME = "python310-bitarray-2.7.6-1.1.aarch64.rpm"
RPM_HASH = "16a21e66d7f85fff15d15d5aeabdaf15fdb1e999beaed4792daffbf9aa89c19488a92c0c0eb141b2b0c21ec7403f108da372dd709c935b8b6c3f5b1c01bd1720"

RPROVIDES:${PN} += "python3.10dist-bitarray \
python310-bitarray \
python3dist-bitarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
