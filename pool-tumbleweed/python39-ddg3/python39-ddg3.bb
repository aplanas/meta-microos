SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.6git~20170824T092521~0ef6b2f"

RPM_NAME = "python39-ddg3-0.6.6git~20170824T092521~0ef6b2f-2.13.noarch.rpm"
RPM_HASH = "bf7dca778d8d54a10359dbe1c6233f0fc5321afdb2f312242f3bcfc0fed428e60eb5e46380dc7b38a02100c24301b000fa4a6e579cdf13955fa33d02333311fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ddg3 \
python39-ddg3 \
python3dist-ddg3"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-requests \
update-alternatives"

inherit rpm
