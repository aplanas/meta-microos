SUMMARY = "CRC Generator"
DESCRIPTION = "The software in this package is a Python module for generating objects that \
compute the Cyclic Redundancy Check (CRC).  There is no attempt in this package \
to explain how the CRC works.  There are a number of resources on the web that \
give a good explanation of the algorithms.  Just do a Google search for 'crc \
calculation' and browse till you find what you need.  Another resource can be \
found in chapter 20 of the book 'Numerical Recipes in C' by Press et. al. \
 \
This package allows the use of any 8, 16, 24, 32, or 64 bit CRC.  You can \
generate a Python function for the selected polynomial or an instance of the \
Crc class which provides the same interface as the ``md5`` and ``sha`` modules \
from the Python standard library.  A ``Crc`` class instance can also generate \
C/C++ source code that can be used in another application."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python310-crcmod-1.7-8.4.aarch64.rpm"
RPM_HASH = "6cf3451846e7070f11a893d982c1ce56d7ff101da75e0ad3b6a7084e0531e9958dfdaf363fd5ce488a7fd083bc8b45a0f34fc673211b76ab52477b58d4973051"

RPROVIDES:${PN} += "python3-crcmod \
python3.10dist(crcmod) \
python310-crcmod \
python310-crcmod(aarch-64) \
python3dist(crcmod)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
