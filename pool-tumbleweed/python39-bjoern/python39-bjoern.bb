SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python39-bjoern-3.2.2-1.5.aarch64.rpm"
RPM_HASH = "67d9ab81a6b6d432a0a7aa47d8f90b62a4a0e34b59b8d594f1c2564432eb6585e4f32c8c35e04aa8665a4cf9186e65439822f000888c6732d58aa3ba62f6aaec"

RPROVIDES:${PN} += "python3.9dist(bjoern) \
python39-bjoern \
python39-bjoern(aarch-64) \
python3dist(bjoern)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libev.so.4()(64bit) \
python(abi)"

inherit rpm
