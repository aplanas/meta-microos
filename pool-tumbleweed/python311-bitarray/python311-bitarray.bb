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

RPM_NAME = "python311-bitarray-2.7.3-1.4.aarch64.rpm"
RPM_HASH = "606afc031713f383852e653bba1358a50be29f754f27313b96ec3498564127efa8493a67dba36e9e602c1b1cf47316576ed4661e3eaf19e8b57ad6462bbb2dba"

RPROVIDES:${PN} += "python3.11dist(bitarray) \
python311-bitarray \
python311-bitarray(aarch-64) \
python3dist(bitarray)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
