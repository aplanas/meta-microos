SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python311-cwcwidth-0.1.8-1.5.aarch64.rpm"
RPM_HASH = "aabf7d69d9e1e8e59b107279d418fb8d83e0df98bc7591ebb19b0e2775e475e7e4f5c0147f5bf88959960911fa8f179b857c163a81653922f0d869f7d710d1c5"

RPROVIDES:${PN} += "python3.11dist-cwcwidth \
python311-cwcwidth \
python3dist-cwcwidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
