SUMMARY = "A memory-efficient packed representation for bit arrays in pure Python"
DESCRIPTION = "With regard to the basic purpose of the module, it defines \
the BitVector class as a memory-efficient packed \
representation for bit arrays. The class comes with a large \
number of methods for using the representation in diverse \
applications such as computer security, computer vision, \
etc."
LICENSE = "Python-2.0"

PV = "3.5.0"

RPM_NAME = "python311-BitVector-3.5.0-1.9.noarch.rpm"
RPM_HASH = "9a4a43454e096b8a4e9c945f7c35358920148c4809569b27f28540271b7afe2d96cb15743033388f158c06d48567cfc953f2f05fafa5af09696ddf0bb8b6b152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-BitVector \
python3.11dist-bitvector \
python311-BitVector \
python3dist-bitvector"

RDEPENDS:${PN} += "python-abi"

inherit rpm
