SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "python39-frozenlist-1.3.3-2.1.aarch64.rpm"
RPM_HASH = "05016cd9bcd7539460f2365510cf816351ae33be725d076e1ec3921f2118cf2b834e84a57f2f3127dcb2da47eca35bf4f48970517defd5595fa23b783c0d06ce"

RPROVIDES:${PN} += "python3.9dist(frozenlist) \
python39-frozenlist \
python39-frozenlist(aarch-64) \
python3dist(frozenlist)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
