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

RPM_NAME = "python39-bitarray-2.8.1-1.1.aarch64.rpm"
RPM_HASH = "4fde34a9575bf3326c8fe752ef3e1900bab9f80166e483477cedc56b8b039ce26731eb2a1c3c34ef1c8af03eccc58ade17c326d9e8a7d9b353a0b02470df241d"

RPROVIDES:${PN} += "python3.9dist-bitarray \
python39-bitarray \
python3dist-bitarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
