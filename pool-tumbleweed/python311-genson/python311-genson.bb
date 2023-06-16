SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python311-genson-1.2.2-2.13.noarch.rpm"
RPM_HASH = "214ecbdb7f809406d415570906e372743067193a7582d0b9c6468dca9fe73ce209bea1e1a9c342e39573d09533f54f8c7785d8bb274c250f07be7f2f4fabb687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-genson \
python311-genson \
python3dist-genson"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
