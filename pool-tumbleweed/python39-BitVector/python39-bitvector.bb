SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python39-BitVector-3.5.0-1.9.noarch.rpm"
RPM_HASH = "07d6e948b79e43592dcbadfc83ece8d9f5885de279e23df4e15761abf589bab0a81ebd3768672941b3c3f94f7d9637cb0b0e386bb8ae86052e17f57db8bb06d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bitvector \
python39-BitVector \
python3dist-bitvector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
