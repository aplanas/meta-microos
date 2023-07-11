SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python310-bjoern-3.2.2-1.7.aarch64.rpm"
RPM_HASH = "8b684914cebe63bdecec934c3b9bf9623d2d8e12e431f8ad6c3486b4559f278c2613aae0b904bd1676ce23c240de1c0d75ac53646161a2fb7b712f30dec4749e"

RPROVIDES:${PN} += "python3.10dist-bjoern \
python310-bjoern \
python3dist-bjoern"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
python-abi"

inherit rpm
