SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python311-bjoern-3.2.2-1.5.aarch64.rpm"
RPM_HASH = "21a40c0f81648e9385d228f72ac6b1340c2288b0be81a8b6752113b227cd86848fcfd18f60c557b42c3b8f70084ad24d8b26d93a1d8843f052b070c7eaf352b1"

RPROVIDES:${PN} += "python3.11dist-bjoern \
python311-bjoern \
python3dist-bjoern"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
python-abi"

inherit rpm
