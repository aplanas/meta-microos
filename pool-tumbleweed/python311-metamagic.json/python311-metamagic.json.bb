SUMMARY = "Python JSON encoder"
DESCRIPTION = "A Python 3 implementation of a JSON encoder for Python objects \
designed to be compatible with native JSON decoders in various web browsers."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "python311-metamagic.json-0.9.6-4.10.aarch64.rpm"
RPM_HASH = "94fd5375c4a3ebfbe896c3e289c9d6853be5f4cded0de692ef616536aca70d767e298ce50e87999083789409b43633efd516712fa30472d9b5c0f66a308438ba"

RPROVIDES:${PN} += "python3.11dist(metamagic.json) \
python311-metamagic.json \
python311-metamagic.json(aarch-64) \
python3dist(metamagic.json)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
