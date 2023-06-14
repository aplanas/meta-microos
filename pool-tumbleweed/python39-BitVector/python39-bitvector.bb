SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python39-BitVector-3.5.0-1.8.noarch.rpm"
RPM_HASH = "65bc6a666e3cf74f04143ec531dd63bdc69d60042cb1fd7877f4c9aad53fd496c46a18c9437ec4484c878e4ee11e8a933b63d66922f1da04603b8d507c3c53b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bitvector \
python39-BitVector \
python3dist-bitvector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
