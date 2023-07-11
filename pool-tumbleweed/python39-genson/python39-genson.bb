SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python39-genson-1.2.2-2.15.noarch.rpm"
RPM_HASH = "9daa54631b021f9165c34a7fa0338ccc60a2b428f4f599e4d4966d8a3dccdf9b0eca962c202c02f27e1f767c0408f3112b75018ceee2a3db90bc56c2a2010f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-genson \
python39-genson \
python3dist-genson"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
