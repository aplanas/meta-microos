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

RPM_NAME = "python311-bitarray-2.7.6-1.1.aarch64.rpm"
RPM_HASH = "00fc45b738c1ca9e53456dcea423025450c630a712ed4ec712c862da0dfda544eaf5e29117accbbb00fa6b868d35b44042b5f37ada3ad4c71090e1923382ff1e"

RPROVIDES:${PN} += "python3-bitarray \
python3.11dist-bitarray \
python311-bitarray \
python3dist-bitarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
