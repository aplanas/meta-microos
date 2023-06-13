SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-cbor-1.0.0-1.23.aarch64.rpm"
RPM_HASH = "513814d99d904f2fc71e64cea85194e6bb2e237aa6a7a5505da33b30ff5ba8188e84d68cc634533bde455c77f9f134bfbe6747a96cbec71e342310ad177a124d"

RPROVIDES:${PN} += "python3.11dist(cbor) \
python311-cbor \
python311-cbor(aarch-64) \
python3dist(cbor)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-base"

inherit rpm
