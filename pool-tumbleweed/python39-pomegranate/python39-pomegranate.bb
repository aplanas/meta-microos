SUMMARY = "A graphical models library for Python"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-pomegranate-0.12.0-2.15.aarch64.rpm"
RPM_HASH = "7c2ea9dc6ea6a81330dbd71cbed87d329512567500e5c86dee622026189e7bedaa85df77e88f5d7dab569b2bb8b28e79b6a14b6b11a3ba6440c55be8836b615e"

RPROVIDES:${PN} += "python3.9dist-pomegranate \
python39-pomegranate \
python3dist-pomegranate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-PyYAML \
python39-joblib \
python39-networkx \
python39-numpy \
python39-scipy"

inherit rpm
