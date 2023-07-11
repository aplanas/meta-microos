SUMMARY = "A graphical models library for Python"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-pomegranate-0.12.0-2.15.aarch64.rpm"
RPM_HASH = "e97b56aee9ebc9844536551967582aa8a0c46e24004c92f73622317d8e7b7d3aa8175cb191d517a06a2f739cb2115b2fa7495f36fb34df0ae49b71da57ddcd79"

RPROVIDES:${PN} += "python3-pomegranate \
python3.11dist-pomegranate \
python311-pomegranate \
python3dist-pomegranate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-PyYAML \
python311-joblib \
python311-networkx \
python311-numpy \
python311-scipy"

inherit rpm
