SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python311-genson-1.2.2-2.15.noarch.rpm"
RPM_HASH = "e536e5dc9b269356f28d95eeb1935cf29c68a9546bef8aa1e9e06d5eee2c04c2db9f55dc7279a97c49b75334db3823cf69444d37b3a76b1175839c351a29f0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genson \
python3.11dist-genson \
python311-genson \
python3dist-genson"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
