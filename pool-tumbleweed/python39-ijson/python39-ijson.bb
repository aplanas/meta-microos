SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.1.4"

RPM_NAME = "python39-ijson-3.1.4-2.2.aarch64.rpm"
RPM_HASH = "6a1c4dccb3b52fe63aee6dfc49d3704c943f715cc025cbd1bb553c9e54732363ddd639613c8f43ec6e25f14ebe620203747b0672fd9056de5b60f177b98472b1"

RPROVIDES:${PN} += "python3.9dist-ijson \
python39-ijson \
python3dist-ijson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2 \
python-abi"

inherit rpm
