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

RPM_NAME = "python39-crcmod-1.7-8.6.aarch64.rpm"
RPM_HASH = "70c234a0def724171ea87c08ff7afdbf2a8976c9d58a3081c79825e643e1b251351e8f7442e292d9450758b303053b9e3e7796faeb149a53bb7df37930b93544"

RPROVIDES:${PN} += "python3.9dist-crcmod \
python39-crcmod \
python3dist-crcmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
