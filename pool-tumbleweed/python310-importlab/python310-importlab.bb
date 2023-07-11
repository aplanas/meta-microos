SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python310-importlab-0.8-1.6.noarch.rpm"
RPM_HASH = "efc87d4098817a9f946791b668eb6b173414ea37963fed260595ac4b6d67b4e49a74903f13dfd4877e6330f830de84226e8aaac9646b96892c10d418d2f9ef0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-importlab \
python310-importlab \
python3dist-importlab"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-networkx \
update-alternatives"

inherit rpm
