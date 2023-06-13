SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.1.4"

RPM_NAME = "python311-ijson-3.1.4-1.11.aarch64.rpm"
RPM_HASH = "f3c9fbf70973cd609046b1df61850c005a5ce0a5c179fe42636f719dcdac8095e80620720520d27a0ae836ff58dc84864b18df8796238d37be3265f163785c18"

RPROVIDES:${PN} += "python3.11dist(ijson) \
python311-ijson \
python311-ijson(aarch-64) \
python3dist(ijson)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libyajl.so.2()(64bit) \
python(abi)"

inherit rpm
