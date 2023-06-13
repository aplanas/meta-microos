SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python310-genson-1.2.2-2.13.noarch.rpm"
RPM_HASH = "1aa3de478ae2ba37482a29eb6a138ac8c85a3e4681e940093d94705a42e564b4e8442762588807c6f8f2ab06c6d377cd960fcc72056bbdf10d20c79fa6255008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genson \
python3.10dist(genson) \
python310-genson \
python3dist(genson)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi)"

inherit rpm
