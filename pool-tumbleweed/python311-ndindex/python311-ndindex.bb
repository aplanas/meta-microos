SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python311-ndindex-1.6-1.3.aarch64.rpm"
RPM_HASH = "a5076f2d72a5b614fa92243df8c8ac07f91bbe4be185ec1d5cfcd28667ab0956b1d77634386277c07872755ec82f87f99ef207e52ff21c512d2bbfa2a4e711dd"

RPROVIDES:${PN} += "python3-ndindex \
python3.11dist-ndindex \
python311-ndindex \
python3dist-ndindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
