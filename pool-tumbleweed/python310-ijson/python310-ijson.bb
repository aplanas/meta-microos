SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python310-ijson-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "f17c612e4a4a3460cc4bce2b628f79826bc0e569af4cbbff81ee8e9ad418de4e4ec7f48ab8a1c9a27ca885f6f0ab35e5b0f828fce3a32ad2b14d9d39e14fdfd8"

RPROVIDES:${PN} += "python3.10dist-ijson \
python310-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
