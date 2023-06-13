SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python311-BitVector-3.5.0-1.8.noarch.rpm"
RPM_HASH = "9eff7a583b9f003a2e0a77be5a6bfa479bbdd678bded1493f2d7ff59e39e4019a62a81f3ee678ffea48280cc9887fcebfa3483f21eba0eb365bcea31ba9c9007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bitvector) \
python311-BitVector \
python3dist(bitvector)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
