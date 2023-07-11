SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python310-genson-1.2.2-2.15.noarch.rpm"
RPM_HASH = "34556ee16cd112777abac9a824ff1cff9ef4c7b6d83c664210db8b8d1073bc7a6b205797ee88a00cd5a7f416f878bfab78616aa3f52b88d5f4bba4d3e5355b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-genson \
python310-genson \
python3dist-genson"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
