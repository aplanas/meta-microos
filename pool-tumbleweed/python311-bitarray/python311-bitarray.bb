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

RPM_NAME = "python311-bitarray-2.8.1-1.1.aarch64.rpm"
RPM_HASH = "863aa572015b9bdeb0e9e1979db48dc52b4e88b449f1cddf8b7447b8b1764d15b289c6662419c2515b355b99c205def384be393ca962c75df847ce0e9b635223"

RPROVIDES:${PN} += "python3-bitarray \
python3.11dist-bitarray \
python311-bitarray \
python3dist-bitarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
