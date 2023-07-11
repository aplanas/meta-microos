SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.6git~20170824T092521~0ef6b2f"

RPM_NAME = "python311-ddg3-0.6.6git~20170824T092521~0ef6b2f-2.14.noarch.rpm"
RPM_HASH = "a677f588f406d77c6f3e36e3814f0e89529d90540b1e03eb4f95f962f4be44eec1b5e835abbdd7fa2b9eb79a817795f53269d01a82b698e88243570d54ef7e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddg3 \
python3.11dist-ddg3 \
python311-ddg3 \
python3dist-ddg3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-requests \
update-alternatives"

inherit rpm
