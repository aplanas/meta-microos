SUMMARY = "Python3 lensfun bindings"
DESCRIPTION = "Lensfun bindings for Python 3"
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python3-lensfun-0.3.3-1.7.aarch64.rpm"
RPM_HASH = "2b3a47c1f262c7da1921a437da96411c7af633d30b634b533cc15a5092e6c681c8b2eb9ec6e01fae1aa956e6f5d9696e92e753c640b2811d6fab051d6bce24e7"

RPROVIDES:${PN} += "python3-lensfun \
python3-lensfun(aarch-64) \
python3.10dist(lensfun) \
python3dist(lensfun)"

RDEPENDS:${PN} += "liblensfun1 \
python(abi)"

inherit rpm
